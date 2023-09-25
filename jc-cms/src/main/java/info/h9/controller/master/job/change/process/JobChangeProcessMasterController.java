package info.h9.controller.master.job.change.process;

import info.h9.domain.job.change.process.JobChangeProcessMasterResponse;
import info.h9.service.job.change.process.JobChangeProcessMasterService;
import info.h9.utils.ResponseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job/change/process")
public class JobChangeProcessMasterController {

    private final JobChangeProcessMasterService jobChangeProcessMasterService;

    public JobChangeProcessMasterController(JobChangeProcessMasterService jobChangeProcessMasterService) {
        this.jobChangeProcessMasterService = jobChangeProcessMasterService;
    }

    @GetMapping("")
    public ResponseEntity<JobChangeProcessMasterResponse> index() {
        return ResponseUtils.buildResponse(JobChangeProcessMasterResponse::new, jobChangeProcessMasterService.getJobChangeProcessMasterList());
    }
}
