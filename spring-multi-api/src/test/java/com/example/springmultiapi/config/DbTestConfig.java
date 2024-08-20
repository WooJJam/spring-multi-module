package com.example.springmultiapi.config;

import org.assertj.core.api.Assertions;
import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import com.example.springmultiapi.SpringMultiApiApplication;
import com.example.springmultiapi.service.TestService;
import com.example.springmultidomain.domain.Member;

@SpringBootTest(classes = SpringMultiApiApplication.class)
@Import(TestConfig.class)
@Testcontainers
public class DbTestConfig {

	private static final String MYSQL_CONTAINER_IMAGE = "mysql:8.0.26";

	@ClassRule
	@Container
	static MySQLContainer<?> MYSQL_CONTAINER = new MySQLContainer<>(MYSQL_CONTAINER_IMAGE)
			.withDatabaseName("spring-multi")
			.withUsername("root")
			.withPassword("test1234");

	@DynamicPropertySource
	public static void setProperties(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.url", () -> MYSQL_CONTAINER.getJdbcUrl());
		registry.add("spring.datasource.username", () -> "root");
		registry.add("spring.datasource.password", () -> "test1234");
		registry.add("spring.jpa.hibernate.ddl-auto", () -> "create");
	}

	@Autowired
	TestService testService;
	@Test
	public void save() throws Exception {
		Member member = testService.memberTest("우잼", "2344");
		System.out.println("member = " + member);
		Assertions.assertThat(member.getName()).isEqualTo("우잼");
	}
}
