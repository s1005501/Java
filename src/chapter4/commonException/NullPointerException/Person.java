package chapter4.commonException.NullPointerException;

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
        if (spouse != null) {
            System.out.println("你好~我叫" + name + "我的另一半是" + spouse.getName());
        } else {
            System.out.println("你好~我叫" + name + "我還沒結婚");

        }
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getName() {
        return this.name;
    }
}
