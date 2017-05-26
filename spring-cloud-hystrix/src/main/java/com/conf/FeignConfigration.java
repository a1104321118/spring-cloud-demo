package com.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;

/**
 * Created by hr on 2017/5/19.
 *
 * 必须放在启动类的包外面
 */
@Configuration
public class FeignConfigration {

    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor(){
        return new BasicAuthorizationInterceptor("user","password123");
    }

    //此处的配置是为了禁用单个Feign的Hystrix  细粒度
    //可以在配置文件中配置  feign.hystrix.enable=false 禁用所有的feign对hystrix的支持  粗粒度
    /*@Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }*/
}
