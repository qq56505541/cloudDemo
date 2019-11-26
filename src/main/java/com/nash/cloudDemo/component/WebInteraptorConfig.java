package com.nash.cloudDemo.component;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebInteraptorConfig implements WebMvcConfigurer {
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] excludeUrl = new String[]{"/","/index.html",
                "/user/userLoginAction/userLoginAction.do"};
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/*").excludePathPatterns(excludeUrl);
    }
}
