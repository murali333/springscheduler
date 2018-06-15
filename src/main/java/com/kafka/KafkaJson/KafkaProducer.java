package com.kafka.KafkaJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
 
 
@Service
public class KafkaProducer {
	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	
	@Autowired
	private KafkaTemplate<String, Match> circTemplate;
	
	@Value("${jsa.kafka.topic}")
	String kafkaTopic ;
	
	@Value("${jsa.kafka.cric.topic}")
	String crickafkaTopic ;
	
	public void send(Customer customer) {
	    System.out.println("sending data=" + customer);
	    kafkaTemplate.send(kafkaTopic, customer);
	}
	
	public void sendMatch(Match match) {
	    System.out.println("sending data=" + match);
	    circTemplate.send(crickafkaTopic, match);
	}
}
