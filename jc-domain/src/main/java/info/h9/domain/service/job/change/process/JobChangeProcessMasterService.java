package info.h9.domain.service.job.change.process;

import info.h9.domain.job.change.process.JobChangeProcessMaster;
import info.h9.domain.job.change.process.JobChangeProcessMasterDto;
import info.h9.domain.repository.job.JobChangeProcessMasterRepository;
import info.h9.domain.service.BaseService;

import java.util.List;

public class JobChangeProcessMasterService implements BaseService {

    private final JobChangeProcessMasterRepository jobChangeProcessMasterRepository;

    public JobChangeProcessMasterService(JobChangeProcessMasterRepository jobChangeProcessMasterRepository) {
        this.jobChangeProcessMasterRepository = jobChangeProcessMasterRepository;
    }

    public JobChangeProcessMasterDto getJobChangeProcessMasterList() {
        List<JobChangeProcessMaster> jobChangeProcessMasterList = jobChangeProcessMasterRepository.findAll();
        return JobChangeProcessMasterDto.builder()
                .jobChangeProcessMasterList(jobChangeProcessMasterList)
                .build();
    }

}
