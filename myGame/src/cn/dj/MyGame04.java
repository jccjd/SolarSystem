package cn.dj;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/26.
 */
public class MyGame04 extends Myframe{

    private double x = 100, y = 100;
    private double degree = 3.14/3;


    public void paint (Graphics g) {
        g.drawOval((int)x,(int)y,30,30);

        x =100+ 100*Math.cos(degree);
        y =100+ 50*Math.sin(degree);

        degree += 0.1;
    }

    public static void main(String[] args) {
        MyGame04 myGame04 = new MyGame04();
        myGame04.launchFrame();
    }
}
