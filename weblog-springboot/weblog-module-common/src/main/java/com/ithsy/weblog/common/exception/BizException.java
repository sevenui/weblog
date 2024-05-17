package com.ithsy.weblog.common.exception;


import lombok.Getter;
import lombok.Setter;

/**
 * Description:
 * Author:sevenui
 * Date:2024-05-17
 * Time:20:20
 */
@Getter
@Setter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}