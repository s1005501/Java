package chapter3;

public class Instanceof {
    public String name;
    public int age;

    public Instanceof(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Instanceof i = new Instanceof("Kevin", 30);

        // instanceof
        // 功能是判斷物件(Object)是否是屬於某類別(Class)或是其子類的實例(subclass)
        // 格式大概如下
        // Object instanceof Class(or subclass)
        System.out.println(i instanceof Instanceof); // true
    }
}
