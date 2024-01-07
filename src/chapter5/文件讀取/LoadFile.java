package chapter5.文件讀取;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

// 文件讀取
// 首先創建一個File物件，其參數放要讀取的文件的路徑(檔案要放在src的外層)
// 再來建立Scanner物件，參數放剛剛創建的File物件的變數，這裡要做exception handling，用try/catch包起來，exception型態用FileNotFoundException。或是throws FileNotFoundException都可以
// 之後就可以透過scanner物件搭配api進行操作
// scanner好像只能掃一次
public interface LoadFile {
    public static void main(String[] args) {
        File f = new File("./asset/sleep.txt");

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            // 這裡要做exception
            // handling，try/catch包起來，exception型態用FileNotFoundException。或是throws
            // FileNotFoundException都可以
            Scanner scanner = new Scanner(f);

            // 把文字檔印出來
            // hasNext()，偵測文字檔的內容是否有資料(空白不算)，回傳布林值，因此可以當作檢查文字檔資料的的判斷條件
            // while (scanner.hasNext()) {
            // // nextLine()，可以取得下一行的資料的內容
            // String line = scanner.nextLine();
            // System.out.println(line);
            // }

            // 計算文字檔的行數、字數、字母數
            // hasNextLine()，偵測文字檔內容是否還有下一行(空白也算)，回傳布林值
            while (scanner.hasNextLine()) {
                // 行數
                lineCount++;

                // 字數
                String line = scanner.nextLine();
                String[] lineArr = line.split(" ");
                for (String word : lineArr) {
                    wordCount++;
                }
                // 字母數
                charCount += line.length();
            }
            // 注意!Scanner用完要關起來，透過呼叫close()的方式
            scanner.close();

            System.out.println("行數是" + lineCount);
            System.out.println("字數是" + wordCount);
            System.out.println("字母數是" + charCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到" + f + "文件!!!");
        }
    }
}
