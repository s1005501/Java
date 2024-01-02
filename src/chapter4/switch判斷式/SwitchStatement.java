package chapter4.switch判斷式;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// Switch/case
// 基本用法跟js相同，變數值要跟case條件一樣才會進入到判斷式裡
// 只能用來比較一個變數
// 只能使用==，>、<、>=、<=都不支援
// 只能用在int、long、short、String、char、enums
// 注意，case結束時要break，以避免貫穿(fall through，即每個判斷式都會執行)的發生

// switch(變數) {
//     case 條件一:
//         執行內容
//         break;
//     case 條件二:
//         執行內容
//         break;
//     default:
//         執行預設內容(前面條件都沒過的情況)
//         break;
// }

// 只能使用||，&&不支援，這個意思是判斷式可以寫成以下的格式(或(||))，case條件一直接寫在case條件二上面
// switch(變數) {
//     case 條件一:
//     case 條件二:
//         執行內容
//         break;
//     case 條件三:
//     case 條件四:
//     case 條件五:
//         執行內容
//         break;
//     default:
//         執行預設內容(前面條件都沒過的情況)
//         break;
// }
public class SwitchStatement extends JPanel implements KeyListener {

    Sheep s;

    public SwitchStatement() {
        s = new Sheep(40, 40);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        s.drawSheep(g);

        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setContentPane(new SwitchStatement());
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();

        // 不加break的話，每個判斷式都會執行
        switch (k) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                s.walk(0, -5);
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                s.walk(0, 5);
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                s.walk(5, 0);
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                s.walk(-5, 0);
                break;

            default:
                JOptionPane.showMessageDialog(this, "請使用方向鍵來移動!");
                break;
        }

        // 進行重繪的動作
        repaint();
        System.out.println(s.toString());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
