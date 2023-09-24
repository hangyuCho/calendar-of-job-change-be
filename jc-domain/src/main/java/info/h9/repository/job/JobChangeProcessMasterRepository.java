package info.h9.repository.job;

import info.h9.domain.job.change.process.JobChangeProcessMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobChangeProcessMasterRepository extends JpaRepository<JobChangeProcessMaster, Long> {
}