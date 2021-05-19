package fact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "fact")
public class FactServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactServiceApplication.class, args);
    }

}