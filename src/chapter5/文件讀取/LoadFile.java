package chapter5.文件讀取;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 文件讀取
// 首先要先import java.io.File，再創建一個File物件，其參數放要讀取的文件的路徑
// 再來建立Scanner物件，參數放剛剛創建的File物件的變數，這裡要做exception handling，try/catch包起來，exception型態用FileNotFoundException。或是throws FileNotFoundException都可以
public interface LoadFile {
    public static void main(String[] args) {
        File f = new File("sleep.txt");
        try {
            // 這裡要做exception handling，try/catch包起來，exception型態用FileNotFoundException。或是throws FileNotFoundException都可以
            Scanner scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
