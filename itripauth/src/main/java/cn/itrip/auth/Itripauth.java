package cn.itrip.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.itrip.*")
public class Itripauth {
    public static void main(String[] args) {
        SpringApplication.run(Itripauth.class, args);
    }
}
