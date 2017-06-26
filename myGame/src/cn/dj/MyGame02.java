package cn.dj;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**测试窗口物体沿着各种轨道移动
* Created by lenovo on 2017/6/23.
*/
public class MyGame02 extends Frame {

Image img = GameUtil.getImage("imgs/1.jpg");

public void launchFrame() {

    setSize(500,500);
    setLocation(100,100);
    setVisible(true);

    new PaintThread().start();

    addWindowFocusListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}
private double x=100,y=100;
private double degree=3.14/3;
private double speed = 10;
@Override
public void paint(Graphics g) {
    g.drawImage(img,(int)x,(int)y,null);
    if (speed>0) {
        speed -= 0.05;
    } else {
        speed = 0;
    }
    x += speed*Math.cos(degree);
    y += speed*Math.sin(degree);
    if (y>500-30||y<30) {
        degree = -degree;
    }
    if (x<0||x>500-30) {
        degree =Math.PI-degree;
    }

}

class PaintThread extends Thread {

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public static void main(String[] args) {
    MyGame02 gf = new MyGame02();
    gf.launchFrame();
    }
}
