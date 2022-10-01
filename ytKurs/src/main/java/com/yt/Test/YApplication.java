package com.yt.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class YApplication {
    public static void main(String[] args) {
        SpringApplication.run(YApplication.class, args);
    }


}
