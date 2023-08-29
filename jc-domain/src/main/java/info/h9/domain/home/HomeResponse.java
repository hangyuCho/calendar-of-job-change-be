package info.h9.domain.home;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonNaming
public class HomeResponse {
    public HomeResponse(HomeDto dto) {
        this.calendarId = dto.getCalendarId();
        this.calendarList = dto.getCalendarList();
    }

    String calendarId;
    List<Object> calendarList;
}
