package spring.testboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAsync
@EnableSwagger2
@SpringBootApplication
public class ChenApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChenApplication.class,args );
    }
}
