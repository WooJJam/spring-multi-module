package com.example.springmultiapi;

import org.springframework.stereotype.Service;

import com.example.springmulticommon.ErrorCode;

@Service
public class TestService {

    public String testSuccess() {
        return ErrorCode.SUCCESS.toString();
    }
}