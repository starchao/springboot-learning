package com.zxc.springboot.config;

import com.zxc.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZXC
 * @create 2020-10-25 11:59
 * @Configuration:指明当前类是一个配置类，来替代之前Spring的配置文件 在配置文件中用<bean></bean>来添加组件
 */
@Configuration
public class myAppConfig {
    //将方法的返回值添加到容器中，容器中这个组件的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器添加组件了。。。");
        return new HelloService();
    }
}
