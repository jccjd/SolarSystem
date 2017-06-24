package practice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lenovo on 2017/6/24.
 */

public class MyGame extends Frame {
    public void launchFrame() {
        setSize(500,500);
        setLocation(200,200);
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
    private boolean up;
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawOval((int)x,(int)y,100,100);

        if (up) {
            y -= 10;
        } else {
            y += 10;
        }
        if (y>500-30){
            up = true;
        }
        if (y<30){
            up = false;
        }
    }
    class PaintThread extends Thread{
        @Override
        public void run() {
            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyGame gf = new MyGame();
        gf.launchFrame();
    }

}