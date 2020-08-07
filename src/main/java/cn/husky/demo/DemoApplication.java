package cn.husky.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Success!!");
        SpringApplication.run(DemoApplication.class, args);
    }

}
