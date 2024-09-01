package com.example.springmultiapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springmulticommon.ErrorCode;
import com.example.springmultidomain.domain.Member;
import com.example.springmultidomain.repository.MemberRepository;

import jakarta.transaction.TransactionScoped;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

    private final MemberRepository memberRepository;
    @Value("${test.admin}")
    private String admin;

    // public String testSuccess() {
    //     return testValue;
    // }

    @Transactional
    public Member memberTest(String name, String password) {
        System.out.println("admin = " + admin);
        Member member = Member.builder()
            .name(name)
            .password(password)
            .build();
        return memberRepository.save(member);
    }

    public String getAdmin() {
        return admin;
    }
}