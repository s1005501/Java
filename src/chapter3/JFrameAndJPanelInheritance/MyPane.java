package chapter3.JFrameAndJPanelInheritance;

import java.awt.Color;

import javax.swing.JPanel;

public class MyPane extends JPanel {

    @Override
    public void paintComponent(java.awt.Graphics g) {
        // 用來檢查畫面是否有重繪
        System.out.println("Java is invoking paintComponent()");

        // g.drawString("Hello World~", 10, 10);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
