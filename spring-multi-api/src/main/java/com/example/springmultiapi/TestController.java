package com.example.springmultiapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmultiapi.service.TestService;
import com.example.springmulticommon.CommonService;
import com.example.springmultidomain.domain.Member;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;
    private final CommonService commonService;

    // @GetMapping("/test")
    // public String testSuccess() {
    //     return testService.testSuccess();
    // }

    @PostMapping("/test")
    public Member saveTest() {
        return testService.memberTest("a","b");
    }

    @GetMapping("/common/test")
    public String testCommonSuccessResponse() {
        return commonService.commonSuccessResponse();
    }
}