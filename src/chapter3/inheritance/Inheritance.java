package chapter3.inheritance;

// 繼承(Inheritance)
// 在Java中，可以將變數和methods從一個class繼承到另一個class。這個過程便稱為繼承(inheritance)
// 其主要的目的是為了避免寫過多重複的程式碼，以及方便之後的維護
// 在繼承概念裡class又分為subclass(子類，繼承別人的class，又稱作child class)、superclass(父類，被別人繼承的class，又稱作parent class)
// child class會比parent class有更多信息，也就是說child class可以額外再寫入其獨特的資料
// java只能做單一繼承，一個class只能有一個parnet class，但是是可以一直繼承上去的(幾代單傳的感覺)
// 所有的Java Class都繼承自java.lang.Object這個Class，只是在語法上面沒有標註
public class Inheritance {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mike", 30, "台北", "電腦科學");
        Teacher teacher2 = new Teacher("Eric", 31, "桃園", "社會科學");
        teacher1.sleep();
        teacher2.teach();

        Student student1 = new Student("Kevin", 36, "新北", 60);
        Student student2 = new Student("Hank", 99, "新北", 100);
        student1.walk();
        student2.learn();

        People p = new People();
        System.out.println(p.address);

    }
}
