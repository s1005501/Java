package chapter5.EnumJava;

// 改成enum的寫法
// enum夾在訪問符、class名稱之間
// 所有的變數都要列舉出來
// public enum class名稱{
//     const變數1,const變數2...
// }

public enum Nationality {
    TAIWANESE, JAPANESE, AMERICAN, CHINESE, CANADIAN
}

// // 之前的寫法
// public class Nationality {
// public static final int TAIWANESE = 1;
// public static final int JAPANESE = 2;
// public static final int AMERICAN = 3;
// public static final int CHINESE = 4;
// public static final int CANADIAN = 5;
// }
