package chapter4.switch判斷式;

import java.awt.Color;

public class Sheep {
    private int x;
    private int y;

    public Sheep(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 畫羊
    public void drawSheep(java.awt.Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x + 23, y + 50, 225, 100);
        g.fillOval(x, y, 75, 75);
        g.fillRect(x + 50, y + 100, 25, 100);
        g.fillRect(x + 100, y + 100, 25, 100);
        g.fillRect(x + 150, y + 100, 25, 100);
        g.fillRect(x + 200, y + 100, 25, 100);

    }

    // 羊走路
    public void walk(int x, int y) {
        this.x += x;
        this.y += y;
    }

    // 檢查羊有沒有移動
    @Override
    public String toString() {
        return x + ", " + y;
    }
}
