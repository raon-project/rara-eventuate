package com.rara.eventuate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import io.eventuate.tram.spring.events.publisher.TramEventsPublisherConfiguration;

@Configuration
@Import({TramEventsPublisherConfiguration.class})
public class EventuateEventAutoConfiguration {
	
}
