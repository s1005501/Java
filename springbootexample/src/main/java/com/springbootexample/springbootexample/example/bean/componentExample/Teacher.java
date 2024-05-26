package com.springbootexample.springbootexample.example.bean.componentExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 一般Java的寫法
// public class Teacher {
//     private Printer printer = new HpPrinter();

//     public void teach() {
//         printer.print("I'm a teracher!");
//     }

//     public static void main(String[] args) {
//         Teacher t = new Teacher();
//         t.teach();
//     }
// }

@RestController
public class Teacher {

    // @Autowired，注入Bean的方式，使用方式是在變數上加上@Autowired即可，但其有兩個限制需要注意
    // 其一是，被注入的class也必須是Bean，也就是說該class也要加上@Component，DI才有辦法注入
    // 其二是，@Autowired在注入Bean時，是會根據"變數的類型來尋找Bean"，以本範例來說的話就是spring
    // boot會去找有沒有printer類型的Bean(包含多型的概念)，有才會注入，沒有就會噴錯
    @Autowired

    // @Qualifier是去指定要注入的Bean的名字是什麼，進而解決同時有兩個同樣類型的Bean存在的問題，簡單來說，就是先由@Autowired篩選類型，再由@Qualifier篩選名字
    // 使用方式是在有加@Autowired的變數下再加上@Qualifier()，()內的參數是Bean的名字
    // 注意事項有二
    // 其一是，必須搭配@Autowired一起使用，單純只用@Qualifier的話是不會產生任何作用的
    // 其二是，其指定的是Bean的名字(透過@Component創建Bean時，其名字會是Class名的第一個字母轉成小寫)
    @Qualifier("hpPrinter")
    private Printer printer;

    @GetMapping("/print")
    public String test() {
        printer.print("Hello World!");
        return "Hello World!";
    }
}
