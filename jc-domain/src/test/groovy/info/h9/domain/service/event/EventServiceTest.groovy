package info.h9.domain.service.event

import info.h9.domain.BaseTest
import org.springframework.beans.factory.annotation.Autowired

public class EventServiceTest extends BaseTest {

    @Autowired
    EventService eventService

    void testGetEventList() {
        given:
        buildTestDate("setup/service/event/event.sql")

        when:
        def result = eventService.getEventList()

        then:
        result != null
    }

    void testGetEventStatusMap() {
        given:
        buildTestDate("setup/service/event/event.sql")

        when:
        def result = eventService.getEventStatusMap()

        then:
        result != null
    }
}
