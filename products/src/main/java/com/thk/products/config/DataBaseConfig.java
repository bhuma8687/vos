package com.thk.products.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
public class DataBaseConfig {
	@Bean
	@Primary	
	public DataSource onlineOrderDataSource(){
		
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost/classicmodels?useSSL=false");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("Password@123");
        return dataSourceBuilder.build();		
	}
	
	@Bean
    public JdbcTemplate jdbcTemplateOnlineOrder(@Qualifier("onlineOrderDataSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }
}
