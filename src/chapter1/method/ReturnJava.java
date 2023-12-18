package chapter1.method;

// return value(返回值) 
// return的功能是將method所指定的值回傳主程序並同時退出method，在退出methood後指示Java繼續執行主程序
// 返回值可以是void, 字串、整數、浮點數或參照(reference data type)

public class ReturnJava {
    public ReturnJava() {

    }

    // return如果放在迴圈裡，會中斷所有迴圈的進行，包含巢狀迴圈
    public void testing() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    return;
                }
                System.out.println(i + "" + j);
            }
        }
    }

    // 在return後面的程式碼都不會執行
    public void testingTwo() {
        System.out.println("before return");
        return;
        // 程式碼寫在return後java就會跳紅字警示你，表示該段不會被執行到，編譯也會有錯誤
        // System.out.println("after return");
    }

    // 一個method只能有一個return
    // 如果有多個return會噴錯，如果想要讓method有不同回傳值，實務上是透過判斷式來達成
    public int testingThree(int i) {
        // 這樣寫會噴錯
        // return 3;
        // return 4;

        if (i == 3) {
            return 3;
        }
        return 5;
    }

    public static void main(String[] args) {
        ReturnJava r = new ReturnJava();
        r.testing();

        r.testingTwo();

        System.out.println(r.testingThree(10));

    }
}
