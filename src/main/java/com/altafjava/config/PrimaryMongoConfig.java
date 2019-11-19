package com.altafjava.config;

import static com.altafjava.config.PrimaryMongoConfig.MONGO_TEMPLATE;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = { "com.altafjava.repository.primary" }, mongoTemplateRef = MONGO_TEMPLATE)
public class PrimaryMongoConfig {

	protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
