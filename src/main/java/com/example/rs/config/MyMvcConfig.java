package com.example.rs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("user/sign-in");
        registry.addViewController("/index.html").setViewName("Department/department");
        //用户路由
        registry.addViewController("/login").setViewName("user/sign-in");
        registry.addViewController("/logout").setViewName("user/sign-up");
        //空白路由
        registry.addViewController("/blank").setViewName("blank-page");
        //部门操作路由
        registry.addViewController("/department").setViewName("Department/department");
        //员工操作路由
        registry.addViewController("/employee").setViewName("Employee/employee");
        registry.addViewController("/viewEmployee").setViewName("Employee/viewEmployee");
        registry.addViewController("/person").setViewName("Employee/person");
        //调动操作路由
        registry.addViewController("/transfer").setViewName("Message/diaodong");
        //用户操作路由
        registry.addViewController("/search").setViewName("Employee/search");

    }
}
