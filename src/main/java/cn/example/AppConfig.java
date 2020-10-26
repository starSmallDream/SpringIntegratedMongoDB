package cn.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.config.MongoConfigurationSupport;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientSettings.Builder;

@EnableMongoRepositories
@ComponentScan(basePackages = "cn.example")
@Configuration
public class AppConfig extends AbstractMongoClientConfiguration {

//	@Bean
	public MongoClientFactoryBean mongoClientFactoryBean() {
		MongoClientFactoryBean mongoClientFactoryBean = new MongoClientFactoryBean();
		mongoClientFactoryBean.setMongoClientSettings(mongoClientSettings());
		return mongoClientFactoryBean;
	}
	
	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "test";
	}
	
	@Override
	public void configureClientSettings(Builder builder) {
		builder.applyConnectionString(new ConnectionString("mongodb://localhost:27017"));
	}

}
