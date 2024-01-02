package chapter1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoopLab extends JPanel {
    // 變數定義在這是為了讓使用者在輸入完資料後JPanel才會跳出來，且也不會隨著拉動視窗就重新跳出輸入視窗
    String type;
    int n;

    public LoopLab() {

        if (type.equals("a") || type.equals("m")) {
            // 因為JOptionPane.showInputDialog回傳的資料會是String，因此要透過Integer.parseInt()將其先轉換成整數
            n = Integer.parseInt(JOptionPane.showInputDialog("你希望的表格大小為?(幾乘幾)"));
        } else {
            // FIXME: 在輸入錯誤時要怎麼讓JPanel不跳出來，老師好像是利用try catch block
            JOptionPane.showMessageDialog(null, "您輸入的資料有誤，請輸入A或M");
            return;
        }
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {

        int w = getWidth();
        int h = getHeight();

        // 畫表格是透過drawRect的方式一個方形一個方形的畫，因此先設定好好最左上角的方形的起始座標
        int x = 0;
        int y = 0;

        // cellWidth、cellHeight是設定每個表格的寬、高個別是多少，總寬高除以user輸入的表格大小
        int cellWidth = w / n;
        int cellHeight = h / n;
        System.out.println(!type.equals("a"));

        // 巢狀迴圈畫表格
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 畫黃色標頭的部分
                if (i == 1 || j == 1) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(x, y, cellWidth, cellHeight);
                }

                // 標頭畫完再把表格蓋上去
                g.setColor(Color.RED);
                g.drawRect(x, y, cellWidth, cellHeight);

                // 畫標頭內容
                if (i == 1) {
                    // 畫橫的標頭
                    g.drawString("" + j, x + 5, y + 15);
                } else if (j == 1) {
                    // 畫直的標頭
                    g.drawString("" + i, x + 5, y + 15);
                } else {

                    int value;
                    if (type.equals("a")) {
                        value = i + j;
                        // x+5、y+15的原因是要讓字能正常地顯示在格子內，如果不做調整的話會超出表格
                        g.drawString("" + value, x + 5, y + 15);
                    }

                    if (type.equals("m")) {
                        // JOptionPane.showMessageDialog(null, "您輸入的資料有誤，請輸入A或M");
                        value = i * j;
                        // x+5、y+15的原因是要讓字能正常地顯示在格子內，如果不做調整的話會超出表格
                        g.drawString("" + value, x + 5, y + 15);
                    }

                }

                // 先往橫的畫
                x += cellWidth;
            }
            // 畫到第二排開始就要先將x歸零，y加一個單位高
            x = 0;
            y += cellHeight;
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }
}
