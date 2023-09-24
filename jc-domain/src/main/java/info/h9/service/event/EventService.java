package info.h9.service.event;

import info.h9.domain.event.Event;
import info.h9.domain.event.EventDto;
import info.h9.repository.event.EventRepository;
import info.h9.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements BaseService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public EventDto getEventList() {
        return EventDto.builder()
                .eventList(eventRepository.findAll())
                .build();
    }

}
