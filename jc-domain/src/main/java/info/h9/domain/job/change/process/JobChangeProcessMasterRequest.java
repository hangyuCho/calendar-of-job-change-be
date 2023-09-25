package info.h9.domain.job.change.process;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import info.h9.domain.event.EventDto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonNaming
public class JobChangeProcessMasterRequest implements Serializable {
    public JobChangeProcessMasterDto toDto() {
        return JobChangeProcessMasterDto.builder().build();
    }

}
