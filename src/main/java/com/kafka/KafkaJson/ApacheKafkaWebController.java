package com.kafka.KafkaJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaProducer kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		Customer mary = new Customer("Mary", 31);
		kafkaSender.send(mary);

		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}
	@PostMapping(value = "/customer")
	public String consumer(@RequestBody Customer cust) {
		Customer newCust = new Customer(cust.getName(), cust.getAge());
		kafkaSender.send(newCust);

		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}
	

}