package com.example.springmultidomain.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springmultidomain.config.DbTestConfig;
import com.example.springmultidomain.repository.MemberRepository;


@SpringBootTest
public class MemberTest extends DbTestConfig {

	@Autowired
	MemberRepository memberRepository;

	@Test
	public void 멤버_테스트() throws Exception {

		Member member = Member.builder()
			.name("jaemin")
			.password("1234")
			.build();

		Member findMember = memberRepository.save(member);
		System.out.println("findMember = " + findMember);
		Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
	}
}
