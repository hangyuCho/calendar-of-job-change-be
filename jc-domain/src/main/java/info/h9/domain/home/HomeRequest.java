package info.h9.domain.home;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
public class HomeRequest implements Serializable {

    @NotNull
    private String calendarId;

    public HomeDto toDto() {
        return HomeDto.builder()
                .calendarId(calendarId)
                .calendarList(List.of("hoge1"))
                .build();
    }
}
