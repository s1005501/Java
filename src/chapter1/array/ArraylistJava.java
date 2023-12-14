package chapter1.array;

import java.util.ArrayList;

public class ArraylistJava {
    public static void main(String[] args) {
        // Arraylist是一個可調整大小的陣列，可以在java.util.ArrayList裡找到
        // 基本的java Arraylist
        // ArrayList<型態> 變數名稱 = new ArrayList<>();
        ArrayList<String> friends = new ArrayList<>();

        // ArrayList的api
        // add()，將資料新增進ArrayList裡
        friends.add("Kevin");
        friends.add("Eric");

        // size()，查看ArrayList的長度
        System.out.println(friends.size());

    }
}
