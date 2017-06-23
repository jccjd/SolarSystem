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
    private boolean left;
    @Override
    public void paint(Graphics g) {

        g.drawImage(img,(int)x, (int)y, null);

        if (left) {
            x -= 30;
        }else{
            x+=30;
        }
        if (x>500-30) {
            left = true;
        }
        if (x<0){
            left = false;
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
        MyGame gf = new MyGame();
        gf.launchFrame();
    }
}
