package com.springbootexample.springbootexample.bean.componentExample;

import org.springframework.stereotype.Component;

// sprindg boot Bean的寫法(@Component+@Autowired)
// @Component，最常用來創建Bean的用法，使用方式是在class上面加上@Component即可，要搭配@Autowired使用
// 這些被創建出來的Bean，他們的名字會是Class名的第一個字母轉成小寫
@Component
public class HpPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("HP印表機: " + message);
    }
}
