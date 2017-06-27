package Solar;

import util.GameUtil;
import util.Myframe;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class SolarFrame extends Myframe {

    Image bg = GameUtil.getImage("images/bg.jpg");

    public void paint (Graphics g) {
        g.drawImage(bg,1,1,null);
    }

    public static void main(String[] args) {
        SolarFrame solarFrame = new SolarFrame();
        solarFrame.launchFrame();
    }
}
