import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class Main extends Myframe{

    public void paint(Graphics g) {
        g.drawOval(Constant.GAME_HEIGHT,Constant.GAME_WIDTH,30,30);

    }

    public static void main(String[] args) {
        Myframe mg = new Myframe();
    }
}
