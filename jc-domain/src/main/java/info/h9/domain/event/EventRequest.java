package info.h9.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import info.h9.domain.home.HomeDto;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonNaming
public class EventRequest implements Serializable {
    public EventDto toDto() {
        return EventDto.builder()
                .build();
    }

}
