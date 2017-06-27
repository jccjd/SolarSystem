package Solar;

import util.GameUtil;
import util.Myframe;
import util.Star;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class SolarFrame extends Myframe {

    Image bg = GameUtil.getImage("images/bg.jpg");
    Star star = new Star("images/bg.jpg",300,300);
    public void paint (Graphics g) {
        g.drawImage(bg,0,0,null);
        star.draw(g);
    }

    public static void main(String[] args) {
        SolarFrame solarFrame = new SolarFrame();
        solarFrame.launchFrame();
    }
}
