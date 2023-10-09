package info.h9.domain.service.job.change.process

import info.h9.domain.BaseTest
import org.springframework.beans.factory.annotation.Autowired

class JobChangeProcessMasterServiceTest extends BaseTest {

    @Autowired
    JobChangeProcessMasterService jobChangeProcessMasterService

    def "getJobChangeProcessMasterList"() {
        given:
        buildTestData("setup/service/event/event.sql")

        when:
        def result = jobChangeProcessMasterService.getJobChangeProcessMasterList()

        then:
        result != null

    }
}
