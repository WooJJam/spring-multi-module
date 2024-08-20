package com.example.springmultiapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmultiapi.service.TestService;
import com.example.springmulticommon.CommonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;
    private final CommonService commonService;

    @GetMapping("/test")
    public String testSuccess() {
        return testService.testSuccess();
    }

    @GetMapping("/common/test")
    public String testCommonSuccessResponse() {
        return commonService.commonSuccessResponse();
    }
}