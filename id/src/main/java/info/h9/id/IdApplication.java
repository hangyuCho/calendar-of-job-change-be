package info.h9.id;

import info.h9.domain.DomainApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = DomainApplication.class)
public class IdApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdApplication.class, args);
    }

}
