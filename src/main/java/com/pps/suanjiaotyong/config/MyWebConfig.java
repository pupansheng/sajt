package com.pps.suanjiaotyong.config;

import com.pps.suanjiaotyong.config.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Classname MyWebConfig
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/16 10:41
 * @Vestion 1.0
 **/
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {

    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login.html","/toLogin","/*.js","/*.css","/fonts/**","/images/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
