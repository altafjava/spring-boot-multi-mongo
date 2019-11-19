package com.altafjava.config;

import static com.altafjava.config.SecondaryMongoConfig.MONGO_TEMPLATE;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = { "com.altafjava.secondary" }, mongoTemplateRef = MONGO_TEMPLATE)
public class SecondaryMongoConfig {

	protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
