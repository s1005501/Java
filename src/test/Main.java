package test;

import java.util.HashMap;

public class Main {

    public String str = "str";

    public Main() {
        System.out.println("6666666");
    }

    public static void main(String[] args) {
        // Main m = new Main();
        // System.out.println(m.str);

        HashMap testHashMap = new HashMap<>();

        int style3 = 0;

        testHashMap.put(style3, "test");

        System.out.println(testHashMap.containsKey(0));
    }
}
