package com.kafka.KafkaJson;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
 
 
@Service
public class KafkaConsumer {
	
	/*@KafkaListener(topics="${jsa.kafka.topic}")
    public void processMessage(Customer customer) {
		System.out.println("received content = " + customer);
    }*/
}
