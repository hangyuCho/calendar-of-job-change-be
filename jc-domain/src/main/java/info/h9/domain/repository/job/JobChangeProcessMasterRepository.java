package info.h9.domain.repository.job;

import info.h9.domain.job.change.process.JobChangeProcessMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobChangeProcessMasterRepository extends JpaRepository<JobChangeProcessMaster, Long> {
    List<JobChangeProcessMaster> findAll();
}