package com.springbootexample.springbootexample.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

// @ResponseBody
// @Controller
@RestController
// @RequestMapping("/test1")
public class HelloController {
    private String hello;

    @GetMapping("/hello")
    public String hello() {
        hello = "Hello World!";
        return hello;
    }

    @Getter
    @Setter
    public class Store {
        public ArrayList<String> products;
    }

    @RequestMapping("/fruits")
    public void fruits() {
        Store store = new Store();
        ArrayList<String> newList = new ArrayList<>();
        newList.add("蘋果");
        newList.add("橘子");

        store.setProducts(newList);
        System.out.println(store.products);
    }

}

// @GetMapping是專門處理Web的GET request，可以當成router也可以當成是Api使用，其參數就是路徑。通常會加在method上
// @GetMapping("路徑")
// public 回傳值 method名稱{
// return 資料;
// }

// @RequestMapping("主路由")
// public class testClass(){

// @RequestMapping("子路由1")
// public String testMethod1(){
// method內容
// }
// @GetMapping("子路由2")
// public String testMethod2(){
// method內容
// }
// }