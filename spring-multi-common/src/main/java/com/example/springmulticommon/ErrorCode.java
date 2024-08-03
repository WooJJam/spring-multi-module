package com.example.springmulticommon;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    SUCCESS("200", "SUCCESS"),
    UNKOWN_ERROR("-9999", "UNKOWN_ERROR");

    private String code;
    private String message;
}