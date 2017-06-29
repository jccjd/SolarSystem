package Solar;

import util.*;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class SolarFrame extends Myframe {

    Image bg = GameUtil.getImage("images/bg.jpg");
//    Star sun = new Star("images/bg.jpg",Constant.GAME_HEIGHT/2,Constant.GAME_WIDTH/2 );

    Star sun = new Star((Constant.GAME_HEIGHT/2),Constant.GAME_WIDTH/2, 50,50);
    Planet  mercury= new Planet(sun,40,25,0.6); //水星
    Planet venus = new Planet(sun,70,35,0.5);  //金星
    Planet earth = new Planet(sun, 100, 50, 0.088); //地球
    Planet moon = new Planet(earth,10,6,0.4, true);//月亮
    Planet mars = new Planet(sun,150, 80,0.05);//火星
    Planet jupliter = new Planet(sun,200,100,0.003);//木星
    Planet  saturn= new Planet(sun,250,120,0.004);//土星
    Planet uranus = new Planet(sun,300,140,0.005);//天王星
    Planet neptune = new Planet(sun,350,160,0.033);//海王星
    Planet pluto = new Planet(sun,400,200,0.041);//冥王星

    public void paint (Graphics g) {

        g.drawImage(bg,0,0,null);

        g.setColor(Color.orange);
        sun.draw(g);

        g.setColor(Color.PINK);
        mercury.draw(g,5,5);

        g.setColor(Color.MAGENTA);
        venus.draw(g,8,8);

        g.setColor(Color.CYAN);
        earth.draw(g,10,10);

        g.setColor(Color.gray);
        moon.draw(g,7,7);

        g.setColor(Color.LIGHT_GRAY );
        mars.draw(g,10,10);

        g.setColor(Color.pink);
        jupliter.draw(g,20,20);

        g.setColor(Color.GREEN);
        uranus.draw(g,15,15);

        g.setColor(Color.PINK);
        neptune.draw(g,12,12);

        g.setColor(Color.RED);
        pluto.draw(g,5,5);

        g.setColor(Color.lightGray);
        saturn.draw(g,14,14);

    }

    public static void main(String[] args) {
        new SolarFrame().launchFrame();
    }
}
