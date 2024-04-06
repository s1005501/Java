package chapter4.memoryLeak;

public class Person {
    private String name;
    private int age;
    // 注意，這裡的型態是Person
    private Person spouse;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk() {
        System.out.println("我的名字是" + name);
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getName() {
        return this.name;
    }
}
