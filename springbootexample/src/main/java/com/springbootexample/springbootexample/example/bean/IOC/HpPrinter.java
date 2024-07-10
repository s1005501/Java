package com.springbootexample.springbootexample.example.bean.IOC;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

// sprindg boot Bean的寫法(@Component+@Autowired)
// @Component，最常用來創建Bean的用法，使用方式是在class上面加上@Component即可，要搭配@Autowired使用
// 這些被創建出來的Bean，他們的名字會是Class名的第一個字母轉成小寫
// @Component
// public class HpPrinter implements Printer {

//     private int count;

//     // 透過@PostConstruct並將其寫在一個method上，並透過該method來設定Bean得初始值
//     @PostConstruct
//     public void initialize() {
//         count = 5;
//     }

//     @Override
//     public void print(String message) {
//         count--;
//         System.out.println("HP印表機: " + message);
//         System.out.println("剩餘使用次數: " + count);
//     }
// }

// 透過@Value讀取到application.properties裡的值
@Component
public class HpPrinter implements Printer {

    @Value("${count}")
    private int count;

    @Override
    public void print(String message) {
        Date start = new Date();

        count--;
        System.out.println("HP印表機: " + message);
        System.out.println("剩餘使用次數: " + count);

        Date end = new Date();

        long time = end.getTime() - start.getTime();
        System.out.println("總共執行了: " + time + "ms");
    }
}
