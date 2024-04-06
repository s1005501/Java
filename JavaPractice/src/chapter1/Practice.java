package chapter1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Practice extends JPanel {

    String type;

    public Practice() {
        type = JOptionPane.showInputDialog("你希望使用加法表還是乘法表?(請輸入A 或 M)").toLowerCase();
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        int weight = getWidth();
        int height = getHeight();
        g.setColor(Color.BLUE);

        System.out.println(!type.equals("a"));

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setContentPane(new Practice());
        window.setVisible(true);

        // System.out.println(type);
    }
}