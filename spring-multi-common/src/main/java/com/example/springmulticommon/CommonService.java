package com.example.springmulticommon;

import org.springframework.stereotype.Service;

@Service
public class CommonService {

    public String commonSuccessResponse() {
        return ErrorCode.SUCCESS.toString();
    }
}