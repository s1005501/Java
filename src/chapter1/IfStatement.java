package chapter1;

public class IfStatement {
    public static void main(String[] args) {
        // if(第一組判斷的條件){
        // 符合條件後要執行的內容
        // }else if(第二組判斷的條件){
        // 符合條件後要執行的內容
        // }else{
        // 上面的條件都不符合則執行此處的的內容
        // }

        // 小於14歲 無行為能力人
        // 14歲-18歲 或 80歲以上 限制行為能力人
        // 18歲-80歲 完全行為能力人
        int age = 16;

        if (age < 14 && age >= 0) {
            System.out.println("你屬於無行為能力人");
        } else if ((age >= 14 && age < 18) || age >= 80) {
            System.out.println("你屬於限制行為能力人");
        } else if (age >= 18 && age < 80) {
            System.out.println("你屬於完全行為能力人");
        }
    }
}
