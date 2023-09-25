package info.h9.domain.job.change.process;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link JobChangeProcessMaster}
 */
@Slf4j
@Builder
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@ToString
@JsonNaming
public class JobChangeProcessMasterDto implements Serializable {
    List<JobChangeProcessMaster> jobChangeProcessMasterList;
}