package com.ohgiraffers.ebproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 컴포넌트 스캔 기능이 있다.
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
