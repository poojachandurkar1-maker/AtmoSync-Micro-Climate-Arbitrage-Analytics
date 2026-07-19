package com.infotact.Atmosync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AtmosyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmosyncApplication.class, args);
    }
}
