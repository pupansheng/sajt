package com.pps.suanjiaotyong.config;

import com.pps.suanjiaotyong.config.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${imagePath}")
    String imagePath;

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {

    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**","/driver/**").excludePathPatterns("/user/toLogin","/user/register","/user/login","/driver/pulish/list/page/","*.js","/css/*.css","/fonts/**","/images/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/uploadImages/**").addResourceLocations("file:/"+imagePath);


    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
