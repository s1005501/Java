package com.springbootexample.springbootexample.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

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

    @GetMapping("/RequestParam")
    public void test1(@RequestParam int id) {
        System.out.println("ID: " + id);
    }

    // TODO: 這個怎麼試都失敗，回家用postman測試看看
    // @Getter
    // @Setter
    public static class Student {
        public String id;
        public String name;
    }

    @PostMapping("/RequestBody")
    public void test2(@RequestBody Student student) {
        System.out.println(student.id);
        // System.out.println(data);
    }

    // 這種方式可以撈到資料
    // @PostMapping("/RequestBody")
    // public void test2(HttpServletRequest request) {
    // System.out.println(request.getParameter("id"));
    // }

    @GetMapping("/RequestHeader")
    public void test3(@RequestHeader String info) {
        System.out.println(info);
    }

    @GetMapping("/PathVariable/{param1}/{param2}")
    public void test4(@PathVariable String param1, @PathVariable String param2) {
        System.out.println(param1);
        System.out.println(param2);
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

// @RequestMapping("路徑")
// public String testMethod(@RequestParam String params){
// System.out.println(params);
// }

// @RequestMapping("路徑")
// public String testMethod(@RequestHeader String params){
// System.out.println(params);
// }

// @RequestMapping("路徑/{要取的某段路徑，用變數承接}")
// public String testMethod(@PathVariable String 路徑裡{}包起來的變數){
// System.out.println(路徑裡{}包起來的變數);
// }