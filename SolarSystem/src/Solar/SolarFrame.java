package Solar;

import util.*;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class SolarFrame extends Myframe {

    Image bg = GameUtil.getImage("images/bg.jpg");
//    Star sun = new Star("images/bg.jpg",Constant.GAME_HEIGHT/2,Constant.GAME_WIDTH/2 );

    Star sun = new Star(Constant.GAME_HEIGHT/2,Constant.GAME_WIDTH/2);
    Planet earth = new Planet(sun, "images/bg.jpg", 150, 100, 0.1);

    public void paint (Graphics g) {

        g.drawImage(bg,0,0,null);
//        sun.draw(g);
        earth.draw(g);
        sun.draw(g);
//        g.setColor(Color.ORANGE);
//        g.fillOval(Constant.GAME_HEIGHT/2,Constant.GAME_WIDTH/2,20,20);
//        g.setColor(Color.CYAN );


    }

    public static void main(String[] args) {
        new SolarFrame().launchFrame();
    }
}
