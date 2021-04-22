package com.rara.eventuate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import io.eventuate.tram.spring.jdbckafka.TramJdbcKafkaConfiguration;

@Configuration
@Import(TramJdbcKafkaConfiguration.class)
public class EventuateCoreAutoConfiguration {

}
