package chapter3.Interface;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 有使用到interface的java api
// keylinster
// 觸發鍵盤事件的interface，通常會搭配Swing使用
// 實際使用要implements KeyLinster
// 建立constructor，在裡面執行addKeyLinster()，參數給this
// 在paintComponent裡呼叫requestFocusInWindow()，透過Swing觸發鍵盤事件
public class KeyLinster extends JPanel implements KeyListener {

    public KeyLinster() {
        addKeyListener(this);
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new KeyLinster());
        window.setVisible(true);
    }

    // 使用keylinster interface固定要override
    // keyTyped、keyPressed、keyReleased三個method，參數都是給KeyEvent e
    @Override
    // 按下按鍵，如果此按鍵可被編碼則觸發此methood
    public void keyTyped(KeyEvent e) {

    }

    @Override
    // 按任何鍵都會觸發此methood
    public void keyPressed(KeyEvent e) {
        // e.getKeyCoded()可以得到鍵盤按鍵的代碼
        System.out.println(e.getKeyCode());

        // 但在實務上會用KeyEvent.VK的方式來使用kyecode
        System.out.println(KeyEvent.VK_UP);
    }

    @Override
    // 按完按鍵要離開時觸發此methood
    public void keyReleased(KeyEvent e) {

    }

}
