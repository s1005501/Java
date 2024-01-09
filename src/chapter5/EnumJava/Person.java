package chapter5.EnumJava;

public class Person {
    private String name;
    // private int homeland;

    // 改成enum寫法
    private Nationality homeland;

    public Person(String n, Nationality h) {
        this.name = n;
        this.homeland = h;
    }
}
