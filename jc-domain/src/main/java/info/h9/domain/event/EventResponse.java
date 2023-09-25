package info.h9.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonNaming
public class EventResponse {
    public EventResponse(EventDto dto) {
        this.results = dto.getEventList();
    }

    private List<Event> results;
}
