package util;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Planet extends Star{

    //椭圆运行：长轴，短轴，速度
    double longAxis;      //长轴
    double shoutAxis;    //短轴
    double speed;       //飞行速度
    double degree;     //角度
    Star center;      //椭圆圆心

    boolean satellite;
//
//    public void draw(Graphics g) {
//
//        super.draw(g);
//        move();
//        if (!satellite) {
//            drawTrace(g);
//        }
//    }

    public void drawTrace(Graphics g) {

        double ovalx, ovaly, ovalwidth, ovalheight;

        ovalheight = shoutAxis*2;
        ovalwidth = longAxis*2;
        ovalx = (center.x + center.width/2) - longAxis;
        ovaly = (center.y + center.height/2) - shoutAxis;


        Color c = g.getColor();
        g.setColor(Color.blue);
        g.drawOval((int) ovalx, (int)ovaly, (int) ovalwidth, (int) ovalheight);
        g.setColor(c);

    }

    public void move() {

        //沿着椭圆轨迹飞行
        x = (center.x + center.width/2) + longAxis*Math.cos(degree);
        y = (center.y + center.height/2) + shoutAxis*Math.sin(degree);
        degree += speed;

    }

public void draw(Graphics g, int width, int height) {

    move();
    g.fillOval((int )x,(int)y,width,height);

    if (!satellite) {
        drawTrace(g);
    }
    //沿着椭圆轨迹飞行
//        x = (center.x +(int) (center.width/2) ) + longAxis*Math.cos(degree);
//        y = (center.y +(int) (center.height/2) ) + shoutAxis*Math.sin(degree);
//        degree += speed;

}
public void draw(Graphics g, int width, int height, boolean satellite) {

        move();
        g.fillOval((int )x,(int)y,width,height);

        if (!satellite) {
            drawTrace(g);
        }
        //沿着椭圆轨迹飞行
//        x = (center.x +(int) (center.width/2) ) + longAxis*Math.cos(degree);
//        y = (center.y +(int) (center.height/2) ) + shoutAxis*Math.sin(degree);
//        degree += speed;

}

public Planet(Star center, double longAxis, double shoutAxis, double speed, boolean satellite) {

    this.center = center;
    this.x = center.width + longAxis;
    this.y = y;
    this.longAxis = longAxis;
    this.shoutAxis = shoutAxis;
    this.speed = speed;
    this.satellite = satellite;
}
public Planet(Star center, double longAxis, double shoutAxis, double speed) {

    this.center = center;
    this.x = center.width + longAxis;
    this.y = y;
    this.longAxis = longAxis;
    this.shoutAxis = shoutAxis;
    this.speed = speed;

}

//    public Planet(Star center, String  imagepath, double longAxis, double shoutAxis, double speed) {
//
//        super(GameUtil.getImage(imagepath));
//        this.center = center;
//        this.x = center.x + longAxis;
//        this.y = y;
//        this.longAxis = longAxis;
//        this.shoutAxis = shoutAxis;
//        this.speed = speed;
////        this.width = image.getWidth(null);
////        this.height = image.getHeight(null);
//        this.width = (int) x;
//        this.height = (int) y;


//    }

//
//    public Planet(Image image, double x, double y) {
//        super(image, x, y);
//    }
//    public Planet(String  imagepath, double x, double y) {
//        super(imagepath, x, y);
//    }
}
