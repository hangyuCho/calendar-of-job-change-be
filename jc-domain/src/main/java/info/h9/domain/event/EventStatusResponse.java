package info.h9.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import info.h9.domain.client.company.ClientCompanyMaster;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Map;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonNaming
public class EventStatusResponse {
    public EventStatusResponse(EventStatusDto dto) {
        this.result = dto.getEventStatusMap();
    }

    private Map<String, List<Event>> result;
}
