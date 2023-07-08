package com.lantu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.lantu.*.mapper")
public class EeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EeApplication.class, args);
    }


}
