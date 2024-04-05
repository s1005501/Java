package chapter5.EnumJava;

public class Person {
    private String name;

    // // 原本的寫法
    // private int homeland;

    // public Person(String n, int h) {
    // this.name = n;
    // this.homeland = h;
    // }

    // public String getName() {
    // return this.name;
    // }

    // public int getNationality() {
    // return this.homeland;
    // }

    // 改成enum寫法
    private Nationality homeland;

    public Person(String n, Nationality h) {
        this.name = n;
        this.homeland = h;
    }

    public String getName() {
        return this.name;
    }

    public Nationality getNationality() {
        return this.homeland;
    }
}
