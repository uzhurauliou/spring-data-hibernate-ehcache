package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = {"com.example"})
public class SpringDataConfig {

//  @Bean
//  public LocalEntityManagerFactoryBean entityManagerFactory() {
//    var factoryBean = new LocalEntityManagerFactoryBean();
//    factoryBean.setPersistenceUnitName("TestDB");
//
//    return factoryBean;
//  }

}
