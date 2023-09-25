package info.h9.domain.job.change.process;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import info.h9.domain.event.Event;
import info.h9.domain.event.EventDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonNaming
public class JobChangeProcessMasterResponse {
    public JobChangeProcessMasterResponse(JobChangeProcessMasterDto dto) {
        this.results = dto.getJobChangeProcessMasterList();
    }

    private List<JobChangeProcessMaster> results;
}
