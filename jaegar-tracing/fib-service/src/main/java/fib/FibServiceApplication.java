package fib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "fib")
public class FibServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FibServiceApplication.class, args);
    }

}