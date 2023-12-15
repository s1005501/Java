package chapter1;

import java.util.Random;
import java.util.Scanner;

// TODO: 有空再寫個java範例
public class GuessNumber {
    public static void main(String[] args) {
        // 建立掃描器
        Scanner s = new Scanner(System.in);

        // 可以猜的數字的最大、最小變數
        int min = 0;
        int max = 100;

        // 透過Random產生隨整機的正解
        Random r = new Random();
        // java產生區間隨機整數的公式
        int secret = r.nextInt(max - min) + min;
        // 善用sout印出資料來確認有沒有錯誤
        System.out.println("終極密碼測試: " + secret);

        while (true) {
            System.out.print("猜猜看數字是多少(在" + min + " ~ " + max + "之間): ");
            int guess = s.nextInt();
            // System.out.println(guess);

            // 先做判斷user猜的數有沒有符合min-max之間的條件，沒有則continue跳掉
            // 判斷夾判斷也可以。個人比較習慣判斷夾判斷
            if (guess < min || guess > max) {
                System.out.println("您輸入的數字並不符合終極密碼的區間喔，請您在試試別的答案!");
                continue;
            }

            // 猜對
            if (guess == secret) {
                System.out.println("恭喜您猜對啦! 終極密碼就是 " + secret + " !");
                // 記得要加break，不然會一直重刷猜數字的sout
                break;
            }

            // 猜得比答案小
            if (guess < secret) {
                min = guess;
                System.out.println("您猜的數字比終極密碼小，請您在試試別的答案!");
            }

            // 猜得比答案大
            if (guess > secret) {
                max = guess;
                System.out.println("您猜的數字比終極密碼大，請您在試試別的答案!");
            }

            // TODO:
            // 計算user猜的次數、每一次猜的數字
        }
    }
}
