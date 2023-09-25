package info.h9.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import info.h9.domain.client.company.ClientCompanyMaster;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
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
public class EventStatusDto implements Serializable {
    Map<String, List<Event>> eventStatusMap;
}