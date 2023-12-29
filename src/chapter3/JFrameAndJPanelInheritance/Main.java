package chapter3.JFrameAndJPanelInheritance;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        // 這行會去抓到MyPane這個object並執行其內的paintCompinent
        window.setContentPane(new MyPane());
        window.setVisible(true);
    }
}
