package chapter3.polymorphism;

// 把Teacher、Student共有的屬性、method放到People裡作為其父類，Teacher、Student再去繼承他的資料
// 父類變數的訪問修飾符通常會是protected
public class People {
    protected String name;
    protected int age;
    protected String address;

    // default constructor，給預設值，method overloading
    public People() {
        this.name = "A person";
        this.age = 0;
        this.address = "Somewhere";
    }

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void printHello() {
        System.out.println("Hello from People class");
    }

  
}
