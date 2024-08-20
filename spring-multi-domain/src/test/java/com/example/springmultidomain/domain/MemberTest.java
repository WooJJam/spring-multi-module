package com.example.springmultidomain.domain;

import javax.swing.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;

import com.example.springmultidomain.RepositoryLocation;
import com.example.springmultidomain.repository.MemberRepository;


@SpringBootTest
public class MemberTest {

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
