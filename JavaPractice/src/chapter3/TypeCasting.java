package chapter3;

// 型態轉換(Type Casting)
// 在java裡，基本資料類型的轉換分為隱式轉換(Widening Casting)與強行轉換(Narrowing Casting)兩種
// 型別大小
// 小--------------------------------------------->大
// byte -> short -> int -> long -> float -> double

// 隱士轉換(Widening Casting)
// 較小的資料型別轉換成較大的資料型別(小轉大)，java會自動幫你做轉型，無風險

// 強行轉換(Narrowing Casting)
// 較大的資料型別轉換成較小的資料型別(大轉小)，java不會幫你轉型，需要給明確的指令，風險較高
// 轉換格式
// 小型別 變數名稱 = (小型別)大型別的資料
public class TypeCasting {
    public static void main(String[] args) {
        // 隱式轉換
        // 因為double的型別比int大，myIntOne賦值給myDoubleOne，就表示值是從int(小)轉成double(大)，合法
        int myIntOne = 5;
        double myDoubleOne = myIntOne;
        System.out.println(myDoubleOne); // 5.0
        System.out.println(myIntOne); // 5

        // 強行轉換
        // 因為double的型別比int大，myDoubleTwo賦值給myIntTwo，就表示值是從double(大)轉成int(小)，就需要寫特別的語法
        double myDoubleTwo = 6.66;
        int myIntTwo = (int) myDoubleTwo;
        System.out.println(myDoubleTwo); // 6.66
        // 這邊可以看到double轉成int後，小數點就被捨棄了，這就是可能會產生風險的地方
        System.out.println(myIntTwo); // 6
    }
}