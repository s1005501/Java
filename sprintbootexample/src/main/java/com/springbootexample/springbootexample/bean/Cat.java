package com.springbootexample.springbootexample.bean;

import org.springframework.stereotype.Component;

// 創建Bean的方式之一
// 直接在class前上加上@Component即可
// Spring生成出來的Bean的名字，會是Class名的第一個字母轉成小寫
// 

@Component
public class Cat {
    private int id;
    private String name;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
