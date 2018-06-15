package com.kafka.KafkaJson;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
public class ScheduledTasks {
	
	
	@Autowired
	KafkaProducer kafkaSender;
	
	Cricbuzz c = new Cricbuzz();
	@Scheduled(fixedRate = 100000)
	public void performTask() throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("Regular task performed at "+System.currentTimeMillis());
		Vector<HashMap<String,String>> matches = c.matches();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(matches);
		System.out.println(json);
		List<Match> matchList = objectMapper.readValue(json, new TypeReference<List<Match>>(){});
		List<Match> testList = matchList.stream().filter(match ->match.getType().equals("TEST")).collect(Collectors.toList());
		//testList.forEach(System.out::println);
		
		for(Match match : testList) {
			kafkaSender.sendMatch(match);
		}
		

	}

}
