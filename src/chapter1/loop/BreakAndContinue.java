package chapter1.loop;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break、continue只能用在迴圈內
        // break
        // 類似斷點的概念，中斷迴圈的運作，js也有相似概念(同樣用於中斷迴圈、switch/case判斷式)
        int i = 0;
        while (true) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }

        // continue
        // 類似於跳過的概念，執行到continue時就跳過剩下的程式，直接進到下一次迴圈，"類似"於js的return，但js的return會直接中斷迴圈運作而不是continue的跳過，且js的return只能在function裡使用，java的continue則不限(?)
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;

            if (j == 5) {
                continue;
            }

            System.out.println("we were here");
        }

        for (int k = 0; k < 15; k++) {
            if (k == 10) {
                continue;
            }
            System.out.println(k);
        }
    }
}
