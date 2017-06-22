package cn.dj;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
/**游戏开发中常用的工具类（加载图片）
 * Created by lenovo on 2017/6/22.
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
