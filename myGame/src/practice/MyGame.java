package practice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**游戏的父类
 *
 * Created by lenovo on 2017/6/24.
 */
public class MyGame extends Frame {

    //显示窗口

    public void launchFrame (){
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
    private double degree = 3.14/3,speed = 10;
public void paint (Graphics g) {
    g.drawRect((int)x,(int)y,100,100);

    if (speed>0){
        speed -=0.05;
    } else {
        speed = 0;
    }
    x += speed*Math.cos(degree);
    y += speed*Math.sin(degree);
    if (x<0||x>500-100) {
        degree = Math.PI-degree;
    }
    if (y>500-100||y<30) {
        degree = -degree;
    }
}
class PaintThread extends Thread {
    @Override
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
    MyGame mg = new MyGame();
    mg.launchFrame();
}
}