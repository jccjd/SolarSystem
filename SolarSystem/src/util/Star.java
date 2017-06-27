package util;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Star {
    Image image;
    double x,y;

    public void draw(Graphics g) {
        g.drawImage(image,(int)x,(int)y,null);
    }
    public Star(Image image,double x,double y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }
    public Star(String imagepath,double x,double y) {
        this.image = GameUtil.getImage(imagepath);
        this.x = x;
        this.y = y;
    }
}
