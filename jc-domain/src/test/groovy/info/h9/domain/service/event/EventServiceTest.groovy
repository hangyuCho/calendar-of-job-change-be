package info.h9.domain.service.event

import info.h9.domain.BaseTest
import info.h9.domain.event.Event
import info.h9.domain.meeting.category.MeetingCategoryType
import org.springframework.beans.factory.annotation.Autowired

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class EventServiceTest extends BaseTest {

    @Autowired
    EventService eventService

    void testGetEventList() {
        given:
        buildTestData("setup/service/event/event.sql")

        when:
        def result = eventService.getEventList()

        then:
        result != null
        result.getEventList().size() == 1

        def final dbData = findOne("id = 1", Event)
        def final scheduleDate = LocalDate.of(2023, 06, 23)
        dbData != null

        verifyAll(dbData) {
            it.getId() == 1L
            it.getScheduleStartAt() == LocalDateTime.of(scheduleDate, LocalTime.of(11, 0,0))
            it.getScheduleEndAt() == LocalDateTime.of(scheduleDate, LocalTime.of(12, 0,0))
            it.getJobChangeProcess().getId() == 1L
            it.getAgentCompanyClientCompanyRelation().getAgentCompanyMaster().getId() == 4L
            it.getAgentCompanyClientCompanyRelation().getClientCompanyMaster().getId() == 1L
            it.getMeetingLink() == "http://zoom.us.com"
            it.getMeetingCategoryType() == MeetingCategoryType.WEB
        }

    }

    void testGetEventStatusMap() {
        given:
        buildTestData("setup/service/event/event.sql")

        when:
        def result = eventService.getEventStatusMap()

        then:
        result != null
    }
}
