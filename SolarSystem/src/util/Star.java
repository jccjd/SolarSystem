package util;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Star {
    Image image;
    double x,y;
    int width, height;
    public Star() {}

//    public void draw(Graphics g) {
//
//        g.drawImage(image,(int)x,(int)y,null);
//    }
    public void draw(Graphics g) {

            g.fillOval((int)x,(int)y,width,height);

        }

    public Star(double x,double y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

//    public Star(Image image,double x,double y) {
//
//        this(image);
//        this.x = x;
//        this.y = y;
//        this.width = (int) x;
//        this.height= (int) y;
//    }
//    public Star(Image image) {
//
//        this.image = image;
////        this.width = image.getWidth(null);
////        this.height = image.getHeight(null);
//
//    }
//    public Star(String imagepath,double x,double y) {
//
//        this(GameUtil.getImage(imagepath),x,y);  //通过this调用另一个构造方法
//
//    }

}
