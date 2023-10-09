package info.h9.domain.service.event;

import info.h9.domain.event.Event;
import info.h9.domain.event.EventDto;
import info.h9.domain.event.EventStatusDto;
import info.h9.domain.repository.event.EventRepository;
import info.h9.domain.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public EventStatusDto getEventStatusMap() {
        return EventStatusDto.builder()
                .eventStatusMap(
                    Optional
                        .of(eventRepository.findAll())
                        .orElse(List.of(new Event()))
                        .stream()
                        .collect(Collectors.groupingBy(
                                (bean -> String.valueOf(bean.getAgentCompanyClientCompanyRelation().getClientCompanyMaster().getId()))))
                ).build();
    }
}
