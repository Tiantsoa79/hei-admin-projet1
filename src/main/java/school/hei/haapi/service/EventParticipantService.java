package school.hei.haapi.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.hei.haapi.model.Event;
import school.hei.haapi.model.EventParticipant;
import school.hei.haapi.repository.EventParticipantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EventParticipantService {
  private  final EventParticipantRepository eventParticipantRepository;

  public List<EventParticipant> getAll(int page , int pageSize){
    Pageable pageable = PageRequest.of(page, pageSize);
    return eventParticipantRepository.findAll(pageable).toList();
  }

  public EventParticipant getEventParticipantById(String id) {
    return eventParticipantRepository.getById(id);
  }

  @Transactional
  public List<EventParticipant> updateEventParticipant(List<EventParticipant> eventParticipantList) {
    return eventParticipantRepository.saveAll(eventParticipantList);
  }
}
