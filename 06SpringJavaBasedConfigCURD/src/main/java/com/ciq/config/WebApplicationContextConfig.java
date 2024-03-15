package com.ciq.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ciq.*")

public class WebApplicationContextConfig implements WebMvcConfigurer{
	
	public DataSource getDataSource() {
		DriverManagerDataSource basicDataSource = new DriverManagerDataSource();
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/SpringMVC");
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("yamini");
		System.out.println(basicDataSource);
		return basicDataSource;
	}
	@Bean
	public JdbcTemplate gettemplate() {
		JdbcTemplate j = new JdbcTemplate(getDataSource());
		return j;
	}

	@Bean
	public InternalResourceViewResolver getinterInternalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}


}
