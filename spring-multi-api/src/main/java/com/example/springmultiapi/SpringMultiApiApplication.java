package com.example.springmultiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.CommonScanPackageLocation;

@EntityScan("com.example")
@SpringBootApplication(
	scanBasePackageClasses = CommonScanPackageLocation.class
)
public class SpringMultiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiApiApplication.class, args);
	}

}
