package chapter3.inheritance;

// 實際的繼承要透過extends這個關鍵字以及super()這個method
// 首先在子類的class的名稱後面加上extends 父類的class名稱
// public class 子類 extends 父類{}
public class Teacher extends People {

    private String subject;

    // 然後再constructor裡呼叫super()去繼承父類的參數，super的()跟constructor的()內都要放父類的參數

    // super主要有兩個功能
    // 第一是super()會去執行superclass裡的constructor，並把其參數帶入到父類的參數裡
    public Teacher(String name, int age, String address, String subject) {
        super(name, age, address);

        // 而當父類有寫預設的constructor時，則在子類不寫super()，其資料就會代父類的預設值
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + subject + "...");

        // super還可以直接呼叫父類裡的method，透過點表示法呼叫，不過不透過super直接呼叫method或是透過this呼叫也都是可以成功執行的
        // 寫super的意義在於增加可讀性，讓我們能夠辨識該method是來自於其父類的資料
        super.printHello();
        printHello();
        this.printHello();
    }

}
