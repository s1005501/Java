package com.springbootexample.springbootexample.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokGetterSetter {
    public int id;
    public String name;

    public static void main(String[] args) {
        LombokGetterSetter l = new LombokGetterSetter();

        l.id = 1;
        l.name = "Kevin";

        System.out.println(l.id);
        System.out.println(l.name);
    }
}

// 沒有lombok的寫法
// public class LombokGetterSetter {
//     public int id;
//     public String name;

//     public int getId() {
//         return this.id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public static void main(String[] args) {
//         LombokGetterSetter l = new LombokGetterSetter();
//         l.setId(10);
//         l.setName("Kevin");

//         System.out.println(l.id);
//         System.out.println(l.name);
//         System.out.println(Integer.toString(l.id));
//     }
// }