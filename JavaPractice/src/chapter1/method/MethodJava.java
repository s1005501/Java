package chapter1.method;

// method通常由以下四種語詞所組成

// 修飾符(modifier)
// public, private

// 返回類型(return type)
// 類型有void, int, String,....等等
// 其中void不會有回傳值，通常用在功能性的函數，void不能再和其他void做操作
// 而其他類型則會有回傳值，常用於計算類的函數
// 因此在看到method時就可以從其組成的返回類型知道有沒有回傳值，如果有是甚麼類型

// 名稱(name)
// 就是函數名稱

// 參數列表(formal parameter or parameter list)
// 就是參數
// 定義methods時使用formal parameter，而執行methods時使用actual parameter

public class MethodJava {
    // method使用方是有兩種，一種是透過實例化的方式來呼叫，一種是在定義method時加上static

    // 透過實例化(new)的方式呼叫
    // 定義一個功能是印出Hello字樣的method(sayHello)
    public void sayHello() {
        System.out.println("Hello!");
    }

    // 另一種method的定義方式，就不用在先建立一個java檔的同名物件，而是可以在psvm裡直接呼叫，定義method時加上static
    public static int add(int x, int y) {
        return x + y;
    }

    // int表示要有回傳值，參數的型態也是要先定義好
    // 定義時的參數叫formal parameter
    public int multiply(int a, int b) {
        System.out.println(a * b);
        // 要透過return回傳
        return a * b;
    }

    public static void main(String[] args) {

        // 透過實例化的方式呼叫
        // 實例化
        MethodJava m = new MethodJava();
        // 就可以透過實例化出來的物件來呼叫sayHello()
        m.sayHello();

        // 定義method時加上static
        System.out.println(add(5, 8));

        // 實際使用時代進去的參數叫actual parameter
        // multiply()就代表了一個回傳的整數值，因此要實際印出來要透過sout，此外可以在跟其他method的回傳值做更進一步的操作
        System.out.println(m.multiply(5, 10) + m.multiply(3, 9));

        // 也可以用變數儲存
        int a = m.multiply(5, 10);
        int b = m.multiply(3, 9);
        System.out.println(a + b);
    }
}
