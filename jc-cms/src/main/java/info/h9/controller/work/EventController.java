package info.h9.controller.work;

import info.h9.domain.event.EventRequest;
import info.h9.domain.event.EventResponse;
import info.h9.domain.event.EventStatusResponse;
import info.h9.service.event.EventService;
import info.h9.utils.ResponseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("")
    public ResponseEntity<EventResponse> index() {
        return ResponseUtils.buildResponse(EventResponse::new, eventService.getEventList());
    }

    @GetMapping("/status/list")
    public ResponseEntity<EventStatusResponse> statusList() {
        return ResponseUtils.buildResponse(EventStatusResponse::new, eventService.getEventStatusMap());
    }
}
