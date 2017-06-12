package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liyikun on 2017/6/8.
 */
@SpringBootApplication
public class SupplyLocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplyLocationRepository.class, args);
    }
}
