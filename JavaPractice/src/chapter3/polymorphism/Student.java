package chapter3.polymorphism;

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
    // Method Override是指，我們可以在child class覆寫從parent class繼承過來的method，但其實它的功能比較像是註記，方便我們辨識，只要子類的method跟父類相同，則加不加@Override都會發生覆寫
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
