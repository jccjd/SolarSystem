import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by lenovo on 2017/6/26.
 */
public class GameUtil {
    public static Image getImage (String path) {
        URL u = GameUtil.class.getClassLoader().getResource(path);
        BufferedImage img = null;
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
