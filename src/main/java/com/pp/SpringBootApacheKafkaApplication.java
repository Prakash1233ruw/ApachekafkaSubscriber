package com.pp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.pp.util.AppConstants;

@SpringBootApplication
public class SpringBootApacheKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = "group_pp_customer")
	public void subscriberMsg(String cxData) {
		System.out.println("*** Message From Kafka ***");
		System.out.println(cxData);
	}

}
