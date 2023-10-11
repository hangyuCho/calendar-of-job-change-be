package info.h9.api;

import info.h9.domain.DomainApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { DomainApplication.class, CalendarOfJobChangeBeApplication.class })
@Slf4j
public class CalendarOfJobChangeBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalendarOfJobChangeBeApplication.class, args);
    }

}
