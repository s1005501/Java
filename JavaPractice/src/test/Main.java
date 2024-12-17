package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public String str = "str";

    public Main() {
        System.out.println("6666666");
    }

    public static void main(String[] args) {
        // String str = "555";
        // System.out.println(str.split(""));
        // String[] test = str.split("");
        // for (String v : test) {
        // System.out.println(v);
        // }

        HashMap<String, String> test = new HashMap<>();

        test.put("name", "Kevin");
        System.out.println(test.get("name"));
    }
}