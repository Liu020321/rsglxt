package com.example.rs.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDtaSource() {
        return new DruidDataSource();
    }


    //后台监控
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        //账户密码
        HashMap<String, String> initParameters = new HashMap<>();
        initParameters.put("loginUsername", "lht");  //登录的key是固定的  loginUsername loginPassword
        initParameters.put("loginPassword", "123456");

        //谁可以访问
        initParameters.put("allow", ""); //参数为空所有人可以访问

        //禁止谁能访问 initParameters.put("","");//配置名字，后面配置ip

        bean.setInitParameters(initParameters);//初始化参数
        return bean;
    }
}
