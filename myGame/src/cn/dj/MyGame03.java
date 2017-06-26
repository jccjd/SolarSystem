package cn.dj;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lenovo on 2017/6/26.
 */
public class MyGame03 extends Frame{
    public void launchFrame (){
        setSize(500,500);
        setLocation(100,100);
        setVisible(true);

        new PaintThread().start();
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
    private double degree =10;
    private double x = 100, y = 100;
    public void paint (Graphics g) {
        g.drawOval((int)x,(int)y,30,30);

        x =100+ 100*Math.cos(degree);
        y =100+ 50*Math.sin(degree);

        degree += 0.1;
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
        MyGame03 myGame03 = new MyGame03();
        myGame03.launchFrame();
    }
}
