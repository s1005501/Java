package chapter1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing，簡單來說就是java的GUI，有點像是舊電腦的視窗介面
// 使用方式

// 步驟二：設定介面的內容
// 要在class名稱後面加上extends JPanel
public class Swing extends JPanel {

    // 要將@Override加在最前面，注意後面沒有分號
    @Override
    // 再來是要加paintComponent，實際要畫得內容寫在paintComponent{}的{}內
    // 注意paintComponent()裡的型態要是java.awt.Graphics，後面則是變數
    // 使用時要透過在paintComponent()裡宣告的變數來呼叫內建的api
    // 內容寫的順序也會有差，後面的會蓋掉前面的
    // 當我們拉動介面視窗時，會讓paintComponent()進行重繪的動作
    public void paintComponent(java.awt.Graphics g) {

        // weight、height這兩個變數可以塞進那些會用到寬高的參數的api內，ex:drawRect()、fillRect()，這樣一來如果我們拉動視窗的話，就可以隨視窗大小變化
        // getWidth()、getHeight()要寫在paintComponent內
        // getWidth()可以抓到介面的寬度，通常會用int weight的變數名稱來承接
        int weight = getWidth();
        // getHeight()可以抓到介面的高度，通常會用int height的變數名稱來承接
        int height = getHeight();

        // setColor()可以設定內容的顏色
        // 注意不能直接輸入顏色，而是要透過Color.顏色的方式
        // 此外擺放的位置也很重要，要放在輸出內容的上面，不然顏色會吃不到
        // 使用時要先將java.awt.Color匯入
        g.setColor(Color.blue);

        // drawString()是寫字串，需要三個參數，第一個是要輸出的內容，後兩個是要顯示的資料的x、y軸
        g.drawString("Hello World", 10, 10);

        // drawLine()是畫線，需要四個參數，前兩個參數是線的起始點的x、y軸，後兩個的參數是線的結尾點的x、y軸
        g.drawLine(50, 50, 100, 100);

        // drawRect()是畫空心的長方形，需要四個參數，前兩個參數是長方形左上角起始點的x、y軸，後兩個的參數是長方形的寬高
        g.drawRect(200, 200, 50, 80);
        // fillRect()是畫實心的長方形，參數用法跟drawRect()一樣
        // g.fillRect(0, 0, weight, height);

        // drawOval()是畫空心圓，需要四個參數，其運作邏輯是先透過那四個參數繪製出一個方形，然後在貼著這個方形再劃出圓型，因此前兩個參數是方形的起始點，後兩個的參數是方形的寬高
        g.drawOval(50, 50, 100, 100);
        // fillOval()是畫實心圓，參數用法跟fillOval()一樣
        // g.fillOval(50, 50, 100, 100);

        // 繪製圖片
        // 首先要先將圖檔放到跟src資料夾同一層的位置
        // 再建立一個ImageIcon物件並用ImageIcon宣告的自定義變數承接
        // new ImageIcon()的()內放的就是你的圖檔的名稱(名稱用雙引號(")包起來)
        ImageIcon img = new ImageIcon("main.jpg");

        // 其次用ImageIcon宣告的自定義變數呼叫paintIcon()
        // paintIcon()功能是繪出圖片，需要四個參數，第一個參數請給null，第兩個參數是java.awt.Graphics定義的變數，後兩個的參數是圖片的起始點的x、y軸
        img.paintIcon(null, g, 50, 50);
    }

    public static void main(String[] args) {
        // 步驟一：先設定好介面
        // 建立新的JFrame物件
        JFrame window = new JFrame();
        // 設定關閉的方式
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 設定GUI視窗的長寬
        window.setSize(300, 300);
        // 要有setContentPane才能將上面paintComponent裡畫的東西輸出，()內要填得是你的class名稱
        window.setContentPane(new Swing());
        // 設定視窗能顯示，注意，這個要放在最下面
        window.setVisible(true);
    }
}