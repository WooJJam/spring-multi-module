package com.example.springmultiapi.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springmultiapi.SpringMultiApiApplication;
import com.example.springmultiapi.config.DbTestConfig;
import com.example.springmultidomain.domain.Member;
import com.example.springmultidomain.repository.MemberRepository;

@SpringBootTest(classes = SpringMultiApiApplication.class)
class TestServiceTest extends DbTestConfig {

	@Autowired
	TestService testService;
	@Test
	public void save() throws Exception {
		Member member = testService.memberTest("우잼", "2344");
		System.out.println("member = " + member);
		Assertions.assertThat(member.getName()).isEqualTo("우잼");
	}
}