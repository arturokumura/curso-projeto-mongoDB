package com.arturokumura.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WorkshopmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopmongoApplication.class, args);
    }

}
