package com.kafka.KafkaJson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaJsonApplication.class, args);
	}
}
