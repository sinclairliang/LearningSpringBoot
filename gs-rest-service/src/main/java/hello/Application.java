package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


/*
@SpringBootApplication adds all the following:
    - @Configuration: tags the class as a source of bean definitions for the application context.
    - @EnableAutoConfiguration: tells Spring Boot to start adding beans based on classpath settings, other beans,
        and various property settings
    - @ComponentScan: tells Spring to look for other components, configurations, and services in the hello package,
        allowing it to find the controllers
 */