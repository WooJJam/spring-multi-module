package com.example.springmultiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.CommonScanPackageLocation;
import com.example.RepoConfig;

@EntityScan("com.example")
@SpringBootApplication(
	scanBasePackageClasses = {CommonScanPackageLocation.class}
)
@EnableJpaRepositories(basePackageClasses = RepoConfig.class)
public class SpringMultiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiApiApplication.class, args);
	}

}
