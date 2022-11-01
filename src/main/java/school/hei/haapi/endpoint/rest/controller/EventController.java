package school.hei.haapi.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.haapi.endpoint.rest.mapper.EventMapper;
import school.hei.haapi.model.Event;
import school.hei.haapi.service.EventService;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/events")
public class EventController {

  private final EventService eventService;
  private final EventMapper eventMapper;

  @GetMapping
  public List<Event> getAllEvent(
          @RequestParam int page,
          @RequestParam int page_size
  ){
    return eventService.getAll(page, page_size);
  }
  @PutMapping
  public List<Event> saveAllEvent(
          @RequestParam int page,
          @RequestParam int pageSize,
          @RequestBody List<school.hei.haapi.endpoint.rest.model.CreateEvent> eventList
  ){
    eventService.saveAllEvent(eventMapper.toDomainList(eventList));
    return eventService.getAll(page, pageSize);
  }

}
