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

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g){
        g.drawRect(100,100,300,300);
        g.drawLine(100,100,200,200);
        g.setColor(Color.cyan);
        g.drawOval(100,100,200,200);
        g.setColor(Color.BLUE);
        Font f = new Font("楷体",Font.BOLD,100);
        g.setFont(f);
        g.drawString("hello",200,200);
        g.setColor(Color.cyan);
        g.fillOval(100,100,100,100);
        g.drawImage(img,200,200,null);
    }

    class PaintThread extends Thread{
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
        MyGame gf = new MyGame();
        gf.launchFrame();

    }

}

