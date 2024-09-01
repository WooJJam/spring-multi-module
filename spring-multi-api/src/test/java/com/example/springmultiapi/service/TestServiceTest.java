package com.example.springmultiapi.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springmultiapi.config.DbTestConfig;
import com.example.springmultidomain.domain.Member;

@SpringBootTest(properties = {"spring.jpa.hibernate.ddl-auto=create"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestServiceTest extends DbTestConfig {

	@Autowired
	TestService testService;

	@Test
	public void save() throws Exception {
		Member member = testService.memberTest("우잼", "2344");
		System.out.println("member = " + member);
		Assertions.assertThat(member.getName()).isEqualTo("우잼");
	}

	@Test
	public void getAdmin() throws Exception {
		String admin = testService.getAdmin();
		System.out.println("admin = " + admin);
		Assertions.assertThat(testService.getAdmin()).isEqualTo("admin1234");
	}
}