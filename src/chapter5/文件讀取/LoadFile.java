package chapter5.文件讀取;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 文件讀取
// 首先創建一個File物件，其參數放要讀取的文件的路徑(但檔案好像要放在src的外層)
// 再來建立Scanner物件，參數放剛剛創建的File物件的變數，這裡要做exception handling，用try/catch包起來，exception型態用FileNotFoundException。或是throws FileNotFoundException都可以
public interface LoadFile {
    public static void main(String[] args) {
        File f = new File("./asset/sleep.txt");
        try {
            // 這裡要做exception
            // handling，try/catch包起來，exception型態用FileNotFoundException。或是throws
            // FileNotFoundException都可以
            Scanner scanner = new Scanner(f);

            // hasNext()，會去偵測文字檔每行的內容是否有值，回傳布林值，因此可以當作檢查文字檔資料的的判斷條件
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到" + f + "文件!!!");
        }
    }
}
