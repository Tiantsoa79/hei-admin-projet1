package school.hei.haapi.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import school.hei.haapi.model.EventParticipant;
import school.hei.haapi.service.EventParticipantService;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
public class EventParticipantController {
    public final EventParticipantService eventParticipantService;


    @GetMapping("/events/{event_id}/event_participants/{event_participant_id}")
    public EventParticipant findEventEventParticipantById (
            @PathVariable String id) {
        return eventParticipantService.getEventParticipantById(id);
    }
    @GetMapping("/events/{event_id}/event_participants")
    public List<EventParticipant> findAllEventParticipant (
            @RequestParam int page,
            @RequestParam int pageSize
    ){
        return eventParticipantService.getAll(page, pageSize);
    }
    @PutMapping("/events/{event_id}/event_participants")
    public List<EventParticipant> saveAllEventParticipant (
            @RequestBody List<EventParticipant> eventParticipantList
    ){
        return eventParticipantService.updateEventParticipant(eventParticipantList);
    }

}


