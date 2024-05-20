package com.ithsy.weblog.jwt.execption;

import org.springframework.security.core.AuthenticationException;

/**
 * Description:
 * Author:sevenui
 * Date:2024-05-20
 * Time:20:04
 */

public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}