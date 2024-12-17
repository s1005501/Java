package chapter3.inheritance;

public class Student extends People {
    private int grades;

    public Student(String name, int age, String address, int grades) {
        super(name, age, address);
        this.grades = grades;
    }

    public void learn() {
        System.out.println("Learning...");
    }

    // Method Override
    // Method Override是指，我們可以在child class覆寫從parent
    // class繼承過來的method。使用時在要改寫的method的上一行加上@Override
    @Override
    public void walk() {
        System.out.println("A student is walking like a boss");
    }

    // 覆寫java equals的功能
    @Override
    public boolean equals(Object p) {
        if (p instanceof People) {
            // 型別大轉小
            People person = (People) p;
            System.out.println(person.getClass().getName());
            return this.age == person.age;
        }
        return false;
    }
}
