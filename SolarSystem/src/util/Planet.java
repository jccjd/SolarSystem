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

    public void draw(Graphics g) {

//        g.drawImage(image,(int)x,(int)y,null);
        g.setColor(Color.cyan);
        g.fillOval((int )x,(int)y,20,20);

        //沿着椭圆轨迹飞行
        x = center.x + longAxis*Math.cos(degree);
        y = center.y + shoutAxis*Math.sin(degree);
        degree += speed;

    }


    public Planet(Star center, String  imagepath, double longAxis, double shoutAxis, double speed) {

        this.center = center;
        this.x = center.x + longAxis;
        this.y = y;
        this.image = GameUtil.getImage(imagepath);
        this.longAxis = longAxis;
        this.shoutAxis = shoutAxis;
        this.speed = speed;

    }

    public Planet(Image image, double x, double y) {
        super(image, x, y);
    }
    public Planet(String  imagepath, double x, double y) {
        super(imagepath, x, y);
    }
}
