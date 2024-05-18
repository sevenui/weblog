package com.ithsy.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Author:sevenui
 * Date:2024-05-18
 * Time:19:22
 */
@Configuration
@MapperScan("com.ithsy.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}