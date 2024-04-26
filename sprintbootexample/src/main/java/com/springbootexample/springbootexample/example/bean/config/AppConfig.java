package com.springbootexample.springbootexample.example.bean.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.springbootexample.springbootexample.example.bean.User;

import lombok.Lombok;

// Bean的創建
// @Configuration是用於設定Spring環境配置，例如宣告及註冊bean至Spring容器中，注入properties參數等
// 直接註解在class上即可。搭配@Bean使用。
@Configuration
// @Import(Lombok.class)
public class AppConfig {

    // @Bean
    // 聲明該method的return值是一個Bean(即創建一個Bean)，只能加在帶有@Configuration class的method上
    // 創建出來的Bean物件的預設名字就是method名稱，但也可以變更，即在@Bean後面加上()，內部給的字串參數就是自行設定的名稱
    // @Bean("新的Bean名稱")
    @Bean
    // 加上@Scope("prototype")就可以讓Bean由單實例轉變為多實例
    @Scope("prototype")
    public User user() {
        var user = new User();
        user.setId(1);
        user.setName("Kevin");
        return user;
    }

}

// 大概格式
// @Configuration
// public class class名稱{
// @Bean
// public 回傳Bean method名稱(){
// var Bean名稱 = new Bean物件();
// return Bean名稱;
// }
// }