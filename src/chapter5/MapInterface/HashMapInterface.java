package chapter5.MapInterface;

import java.util.Map;
import java.util.HashMap;

// Map Interface
// 可儲存鍵值對(key value pair)的資料
// 一個Map裡不能有兩個相同的key
// 常用的有HashMap、TreeMap兩種class

// HashMap
// 實際使用的格式如下，另外要記得import java.util.Map、java.util.HashMap
// Map<key型態, value型態> 變數名稱 = new HashMap<>();
// put()，可以將鍵值對塞進HashMap中

public class HashMapInterface {
    public HashMapInterface() {
        Map<String, Integer> incomeMap = new HashMap<>();
        incomeMap.put("Kevin", 3000);
        incomeMap.put("Hank", 4000);
        incomeMap.put("Eric", 5000);
        incomeMap.put("Robert", 8000);
        System.out.println(incomeMap.get("Kevin"));

        System.out.println("-------------------------------------------");
        // 透過迴圈將Map裡的資料印出來的方式有兩種
        // 第一種，透過for迴圈，比較少用(因為實在太長)
        // for()裡的參數要用Map.Entry<key型態, value型態> entry(通常會叫這個名字) : 變數名稱.entrySet()
        // for(Map.entry<key型態, value型態> entry : map變數名稱.entrySet()){
        // 迴圈執行內容
        // }
        for (Map.Entry<String, Integer> entry : incomeMap.entrySet()) {
            // 之後可以透過getKey()、getValue()取到key、value值
            // 資料輸出的順序是由java決定得
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("-------------------------------------------");

        // 第二種，透過forEach(實務上的用法)
        // 變數名稱.forEach((key,value)->{});
        incomeMap.forEach((name, income) -> {
            System.out.println(name + ", " + income);
        });
    }

    public static void main(String[] args) {
        new HashMapInterface();
    }
}
