package com.nash.cloudDemo.config;

import com.nash.cloudDemo.component.LoginHandlerInterceptor;
import com.nash.cloudDemo.component.MyLocaleResolver;
import com.nash.cloudDemo.component.WebInteraptorConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
//@EnableWebMvc
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

        };
        
        return adapter;
    }
    
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebInteraptorConfig();
    }
    
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
