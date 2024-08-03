package com.example.springmultiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.springmulticommon.CommonScanPackageLocation;

@EntityScan("com.example")
@SpringBootApplication(
	scanBasePackageClasses = CommonScanPackageLocation.class
)
public class SpringMultiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiApiApplication.class, args);
	}

}
