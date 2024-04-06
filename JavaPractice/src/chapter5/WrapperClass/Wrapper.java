package chapter5.WrapperClass;

import java.util.ArrayList;

// wrapper class
// Java爲primitive data types提供了Wrapper Class，讓我們可以把primitive data types當作objects來使用
// 簡單來說就是可以將int、boolean變成Integer、Boolean等物件做使用
// 其用途在於：
// 可以用來儲存objects。ex:可以將integer存進ArrayList(ex:ArrayList<Integer>)
// Java Synchronization當中的Multi-threading只能用objects來合作
// Serialization只能用objects來合作
public class Wrapper {
    public static void main(String[] args) {

        // 基本上以下兩行的功能是一樣的，但建議不要用wrapper class的方式宣告變數，已被java棄用且效能較差
        // Integer i = new Integer(15);
        int i = 15;
        System.out.println(i);

        ArrayList<Integer> example = new ArrayList<>();
    }
}
