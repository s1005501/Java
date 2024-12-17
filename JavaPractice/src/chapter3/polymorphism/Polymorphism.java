package chapter3.polymorphism;

import java.util.ArrayList;

// 多型(polymorphism)
// 多型的功能在於，如果我們透過父類宣告了一個變數，那這個變數可以承接任何子類物件，常用在陣列(Array、ArrayList)、父類class實例化子類class等等的使用
// 以陣列的使用來說就是，如果我們建立一個其值為People物件的陣列，那這個陣列的值不僅僅可以裝People，還可用來裝Teacher、Student
public class Polymorphism {
    public static void main(String[] args) {
        // 多型在父類class實例化子類class的實例
        People s1 = new Student("Kevin", 36, "新北", 60);
        People s2 = new Student("Hank", 99, "新北", 100);

        People t1 = new Teacher("Mike", 30, "台北", "電腦科學");
        Teacher t2 = new Teacher("Eric", 36, "桃園", "社會科學");

        // 多型在陣列(Array、ArrayList)的實例
        // Array
        People[] p1 = new People[10];
        p1[0] = s1;
        p1[1] = s2;
        p1[2] = t1;
        p1[3] = t2;
        for (int i = 0; i < 4; i++) {
            System.out.println(p1[i].name); // Kevin Hank Mike Eric
        }

        System.out.println();

        // ArrayList
        ArrayList<People> p2 = new ArrayList<>();
        p2.add(s1);
        p2.add(s2);
        p2.add(t1);
        p2.add(t2);

        for (int j = 0; j < 4; j++) {
            System.out.println(p2.get(j).name); // Kevin Hank Mike Eric
        }
    }
}
