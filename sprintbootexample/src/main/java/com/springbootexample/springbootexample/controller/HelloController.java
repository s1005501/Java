package com.springbootexample.springbootexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @ResponseBody
// @Controller

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/fruits")
    public String fruits() {
        return "Apple! Orange!";
    }
}

// @GetMapping是專門處理Web的GET request，可以當成router也可以當成是Api使用，其參數就是路徑。通常會加在method上
// @GetMapping("路徑")
// public 回傳值 method名稱{
// return 資料;
// }
