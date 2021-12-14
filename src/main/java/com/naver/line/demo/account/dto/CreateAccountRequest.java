package com.naver.line.demo.account.dto;

import javax.validation.constraints.*;

public class CreateAccountRequest {
    @Min(value=0)
    @Max(value=5000000)
    @NotBlank(message = "1회 이체한도는 필수입니다")
    int transferLimit;

    @Min(value=0)
    @Max(value=10000000)
    @NotBlank(message = "1일 이체한도는 필수입니다.")
    int dailyTransferLimit;

    public int getTransferLimit() {
        return transferLimit;
    }

    public int getDailyTransferLimit() {
        return dailyTransferLimit;
    }
}

