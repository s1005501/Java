package chapter5.EnumJava;

// Enum
// java裡的一種特殊的class，用來表示一組const變數(final)，在此功能出現之前通常會用public static final int來表示enum
// enum的優點
// 解決public static final int相加導致的問題
// 解決public static final int可能被更改的問題
// 在compile time發現錯誤，而不是在run time
public class EnumJava {
    public static void main(String[] args) {
        // 原本的寫法
        // Person p1 = new Person("Kevin", 1);
        // Person p2 = new Person("Dory", 2);

        // enum的寫法
        Person p1 = new Person("Kevin", Nationality.TAIWANESE);
        Person p2 = new Person("Dory", Nationality.AMERICAN);

        System.out.println(p2.getNationality());
    }
}
