package com.ibrahim.financeManagement;

import com.ibrahim.financeManagement.Core.Config.JwtConfig;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = "com.ibrahim.financeManagement")
@EnableConfigurationProperties(JwtConfig.class)
public class FinanceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceManagementApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
