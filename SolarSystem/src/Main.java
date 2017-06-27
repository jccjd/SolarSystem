import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class Main extends Myframe{

    private double x = 100,y = 100;
    private double defree = 3.14/3;
    public void paint(Graphics g) {
        g.drawOval((int)x,(int)y,30,30);

        x = 100+ 100*Math.cos(defree);
        y = 100+ 50*Math.sin(defree);

        defree +=0.04;
    }

    public static void main(String[] args) {
        Main mg = new Main();
        mg.launchFrame();
    }
}
