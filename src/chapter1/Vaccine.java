package chapter1;

import javax.swing.JOptionPane;

public class Vaccine {
    public static void main(String[] args) {
        // JOptionPane是java的一個library，它能快速生成簡單的UI介面
        // showInputDialog產生的介面跟JS的prompt差不多
        // 使用者輸入的資料會被JOptionPane回傳，因此用變數去承接其值
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含AZ, BNT, Moderna, Janssen):");

        // 先將資料轉成小寫
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            // showMessageDialog產生的介面跟JS的alert差不多
            JOptionPane.showMessageDialog(null, "AZ\n研發國：英國、瑞典\n疫苗類型：腸病毒疫苗\n劑量：兩劑\n保護力：81%");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\n研發國：德國、美國\n疫苗類型：mRNA疫苗\n劑量：兩劑\n保護力：95%");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showMessageDialog(null, "Moderna\n研發國：美國\n疫苗類型：mRNA疫苗\n劑量：兩劑\n保護力：94%");
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showMessageDialog(null, "Janssen\n研發國：美國、比利時\n疫苗類型：腸病毒疫苗\n劑量：一劑\n保護力：66%");
        } else {
            JOptionPane.showMessageDialog(null, "無法辨認輸入內容，請重新確認輸入內容沒有中文字或是空白鍵，且符合選項");
        }

    }
}
