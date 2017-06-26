package cn.dj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 */
public class MyGame extends Frame {

Image img = GameUtil.getImage("imgs/1.jpg");

public void launchFrame() {
    setSize(500, 500);
    setLocation(100, 100);
    setVisible(true);

    //移动图片
    new PaintThread().start();

    addWindowFocusListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}
private double x=100,y=100;
private boolean left,up;

@Override
public void paint(Graphics g){
    g.drawRect(100,100,300,300);
    g.drawLine(100,100,200,200);
    g.setColor(Color.cyan);
    g.drawOval(100,100,200,200);
    g.setColor(Color.BLUE);
    Font f = new Font("楷体",Font.BOLD,100);
    g.setFont(f);
    g.drawString("你好",200,200);
    g.setColor(Color.cyan);

    g.fillOval((int) x, (int) y,100,100);

    g.drawImage(img, (int) x, (int) y, null);
//
//        if (left) {
//            x -= 30;
//
//        } else {
//            x += 30;
//        }
//        if (x>500-30) {
//            left = true;
//        }
//        if (x<0) {
//            left = false;
//        }

    if (up) {
        y -= 3;

    } else {
        y += 3;
    }
    if (y>500-30) {
        up = true;
    }
    if (y<30) {
        up = false;
    }
}
//移动图片
class PaintThread extends Thread{
    public void run() {
        while (true) {

            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//测试
public static void main(String[] args) {
    MyGame gf = new MyGame();
    gf.launchFrame();

}

}

