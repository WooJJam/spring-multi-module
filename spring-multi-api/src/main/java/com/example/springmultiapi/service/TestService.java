package com.example.springmultiapi.service;

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

    public String testSuccess() {
        return ErrorCode.SUCCESS.toString();
    }

    @Transactional
    public Member memberTest(String name, String password) {
        Member member = Member.builder()
            .name(name)
            .password(password)
            .build();
        return memberRepository.save(member);
    }
}