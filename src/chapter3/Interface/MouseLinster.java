package chapter3.Interface;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 有使用到interface的java api
// MouseLinster
// 觸發滑鼠事件的interface，通常會搭配Swing使用
// 基本用法跟KeyLinster一樣，差在其對應的是滑鼠事件，另外要override的method為mouseClicked、mousePressed、mouseReleased、mouseEntered、mouseExited，參數都是給MouseEvent e
public class MouseLinster extends JPanel implements MouseListener {

    public MouseLinster() {
        addMouseListener(this);
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new MouseLinster());
        window.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // getX()取得滑鼠點擊時在螢幕的x軸座標
        System.out.println(e.getX());
        // getY()取得滑鼠點擊時在螢幕的y軸座標
        System.out.println(e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
