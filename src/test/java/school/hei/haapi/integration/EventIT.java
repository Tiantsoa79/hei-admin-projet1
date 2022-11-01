package school.hei.haapi.integration;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.junit.jupiter.Testcontainers;
import school.hei.haapi.SentryConf;
import school.hei.haapi.endpoint.rest.api.EventApi;
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.model.CreateEvent;
import school.hei.haapi.endpoint.rest.model.Event;
import school.hei.haapi.endpoint.rest.model.Place;
import school.hei.haapi.endpoint.rest.security.cognito.CognitoComponent;
import school.hei.haapi.integration.conf.AbstractContextInitializer;
import school.hei.haapi.integration.conf.TestUtils;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static school.hei.haapi.integration.conf.TestUtils.MANAGER1_TOKEN;
import static school.hei.haapi.integration.conf.TestUtils.STUDENT1_TOKEN;
import static school.hei.haapi.integration.conf.TestUtils.TEACHER1_TOKEN;
import static school.hei.haapi.integration.conf.TestUtils.anAvailableRandomPort;
import static school.hei.haapi.integration.conf.TestUtils.assertThrowsForbiddenException;
import static school.hei.haapi.integration.conf.TestUtils.isValidUUID;
import static school.hei.haapi.integration.conf.TestUtils.setUpCognito;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@Testcontainers
@ContextConfiguration(initializers = EventIT.ContextInitializer.class)
@AutoConfigureMockMvc
@Slf4j
public class EventIT {
  @MockBean
  private SentryConf sentryConf;
  @MockBean
  private CognitoComponent cognitoComponentMock;

  static class ContextInitializer extends AbstractContextInitializer {
    public static final int SERVER_PORT = anAvailableRandomPort();

    @Override
    public int getServerPort() {
      return SERVER_PORT;
    }
  }

  private static ApiClient anApiClient(String token) {
    return TestUtils.anApiClient(token, EventIT.ContextInitializer.SERVER_PORT);
  }
  @BeforeEach
  void setUp() {
    setUpCognito(cognitoComponentMock);
  }
  static Event event() {
    Event event = new Event();
    event.id("id_event");
    event.eventType("string");
    event.startTime("string");
    event.endTime("string");
    return event;
  }

  public static CreateEvent creatableEvent1() {
    CreateEvent newEvent = new CreateEvent();
    newEvent.id("string");
    newEvent.eventType("string");
    newEvent.endTime("string");
    newEvent.startTime("string");
    newEvent.idPlace(event().getPlace().getId());
    return newEvent;
  }

  @Test
  void student_read_ok() throws ApiException {
    ApiClient student1Client = anApiClient(STUDENT1_TOKEN);

    EventApi api = new EventApi(student1Client);
    Event event = new Event();
    event.setId(event().getId());
    event.setEventType(event().getEventType());
    event.setEndTime(event().getEndTime());
    event.setStartTime(event().getStartTime());
    event.setPlace(new Place());
    List<Event> events = api.getEvents(1,100);

    assertTrue(events.contains(event));
  }

  @Test
  void student_write_ko() {
    ApiClient student1Client = anApiClient(STUDENT1_TOKEN);

    EventApi api = new EventApi(student1Client);
    assertThrowsForbiddenException(() -> api.createOrUpdateEvents(List.of()));
  }

  @Test
  void teacher_write_ko() {
    ApiClient teacher1Client = anApiClient(TEACHER1_TOKEN);

    EventApi api = new EventApi(teacher1Client);
    assertThrowsForbiddenException(() -> api.createOrUpdateEvents(List.of()));
  }

  @Test
  void manager_write_create_ok() throws ApiException {
    ApiClient manager1Client = anApiClient(MANAGER1_TOKEN);
    CreateEvent toCreate3 = creatableEvent1();

    EventApi api = new EventApi(manager1Client);
    Event created = (Event) api.createOrUpdateEvents(List.of());

    assertEquals( created.getEventType() ,toCreate3.getEventType());
    Event created3 = created;
    assertTrue(isValidUUID(created3.getId()));
    toCreate3.setId(created3.getId());
    toCreate3.setStartTime(created3.getStartTime());
    assertNotNull(created3.getEndTime());
    toCreate3.setEndTime(created3.getEndTime());
  }

}
