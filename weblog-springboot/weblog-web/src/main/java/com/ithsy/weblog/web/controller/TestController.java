package com.ithsy.weblog.web.controller;

import com.ithsy.weblog.common.aspect.ApiOperationLog;
import com.ithsy.weblog.common.exception.BizException;
import com.ithsy.weblog.common.enums.ResponseCodeEnum;
import com.ithsy.weblog.common.utils.Response;
import com.ithsy.weblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author:sevenui
 * Date:2024-05-17
 * Time:19:34
 */
@RestController
@Slf4j
public class TestController {

//    @PostMapping("/test")
//    @ApiOperationLog(description = "测试接口")
//    public User test(@RequestBody User user){
//
//        return user;
//    }


    //参数校验test
/*@Validated: 告诉 Spring 需要对 User 对象执行校验;
BindingResult : 验证的结果对象，其中包含所有验证错误信息；*/
//    @PostMapping("/test")
//    @ApiOperationLog(description = "测试接口")
//    public ResponseEntity<String> test(@RequestBody @Validated User user, BindingResult bindingResult) {
//        // 是否存在校验错误
//        if (bindingResult.hasErrors()) {
//            // 获取校验不通过字段的提示信息
//            String errorMsg = bindingResult.getFieldErrors()
//                    .stream()
//                    .map(FieldError::getDefaultMessage)
//                    .collect(Collectors.joining(", "));
//
//            return ResponseEntity.badRequest().body(errorMsg);
//        }
//
//        // 返参
//        return ResponseEntity.ok("参数没有任何问题");
//    }

    //统一返回结果测试
//    @PostMapping("/test")
//    @ApiOperationLog(description = "测试接口")
//    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
//        // 是否存在校验错误
//        if (bindingResult.hasErrors()) {
//            // 获取校验不通过字段的提示信息
//            String errorMsg = bindingResult.getFieldErrors()
//                    .stream()
//                    .map(FieldError::getDefaultMessage)
//                    .collect(Collectors.joining(", "));
//
//            return Response.fail(errorMsg);
//        }
//
//        // 返参
//        return Response.success();
//    }

    //全局异常处理测试
    @PostMapping("/test1")
    @ApiOperationLog(description = "测试接口")
    public Response test1(@RequestBody @Validated User user, BindingResult bindingResult) {
        // 手动抛异常，入参是前面定义好的异常码枚举，返参统一交给全局异常处理器搞定
        throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);
    }

}
