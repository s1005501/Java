package chapter1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    // 限制資料的值只能到小數點後兩位
    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // BMI 計算公式 (kg / m^2)

        // Scanner的功能是類似掃描器，()內給System.in當參數的話可以讓使用者可以在terminal裡輸入資料
        // 這裡如果沒有輸入資料的話，code就會停在這不動，當然也可以手動將程式終止下來，run
        // java後可以看到VSC上面的工具列裡有紅色方塊的符號，點擊就可以將java停下(快捷是Shift + F5) ，綠色的則是重整(Ctrl + Shift
        // + F5)
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入您的體重(公斤)：");

        // 這裡的意思是透過剛剛建起來的scaner去掃描下一個找到的double並存進weight變數裡
        double weight = scanner.nextDouble();
        // System.out.println(weight);

        System.out.print("請輸入您的身高(公分)：");
        double height = scanner.nextDouble() / 100;
        // System.out.println(height);

        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("您的BMI數值為" + bmi);

        if (bmi < 18.5) {
            System.out.println("您屬於過輕類型");
        } else if (bmi < 24) {
            System.out.println("您屬於正常類型");
        } else if (bmi < 30) {
            System.out.println("您屬於微胖類型");
        } else {
            System.out.println("您屬於過胖類型");
        }
        scanner.close();
    }
}
