package chapter1.loop;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break、continue只能用在迴圈內
        // break
        // 類似斷點的概念，中斷迴圈的運作，js也有相似概念(同樣用於中斷迴圈、switch/case判斷式)
        // break跟return在功能上很相似都有中斷迴圈運作的功能，他們之間的差異在於break只能打斷當前迴圈，而return則是可以打斷全部迴圈(含巢狀)

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println(i + "" + j);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    return;
                }
                System.out.println(i + "" + j);
            }
        }

        // continue
        // 類似於跳過的概念，執行到continue時就跳過剩下的程式，直接進到下一次迴圈
        // int k = 0;
        // while (k < 10) {
        // System.out.println(k);
        // k++;

        // if (k == 5) {
        // continue;
        // }

        // System.out.println("we were here");
        // }

        // for (int l = 0; l < 15; l++) {
        // if (l == 10) {
        // continue;
        // }
        // System.out.println(l);
        // }
    }
}
