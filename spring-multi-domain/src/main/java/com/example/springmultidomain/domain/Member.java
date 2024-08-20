package com.example.springmultidomain.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

	@Id @GeneratedValue
	private Long id;

	private String name;
	private String password;

	@Builder
	public Member(String name, String password) {
		this.name = name;
		this.password = password;
	}
}
