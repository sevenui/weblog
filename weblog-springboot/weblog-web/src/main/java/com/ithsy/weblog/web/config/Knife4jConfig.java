package com.ithsy.weblog.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * Description:
 * Author:sevenui
 * Date:2024-05-17
 * Time:20:37
 */
@Configuration
@EnableSwagger2WebMvc
@Profile("dev") // 只在 dev 环境中开启
public class Knife4jConfig {

    @Bean("webApi")
    public Docket createApiDoc() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                // 分组名称
                .groupName("Web 前台接口")
                .select()
                // 这里指定 Controller 扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.ithsy.weblog.web.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    /**
     * 构建 API 信息
     * @return
     */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("ithsy博客前台接口文档") // 标题
                .description("ithsy是一款由 Spring Boot + Vue 3.2 + Vite 4.3 开发的前后端分离博客。") // 描述
                .termsOfServiceUrl("https://www.ithsy.com/") // API 服务条款
                .contact(new Contact("ithsy", "https://www.ithsy.com", "2179744658@qq.com")) // 联系人
                .version("1.0") // 版本号
                .build();
    }
}