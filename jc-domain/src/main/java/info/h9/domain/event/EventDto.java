package info.h9.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import info.h9.domain.client.company.ClientCompanyMaster;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;

/**
 * DTO for {@link Event}
 */
@Slf4j
@Builder
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@ToString
@JsonNaming
public class EventDto implements Serializable {
    List<Event> eventList;
}