package com.example.springmultidomain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmultidomain.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
