package util;

import java.awt.*;

/**
 * Created by lenovo on 2017/6/27.
 */
public class GameUtil {

    private GameUtil(){};

    public static Image getImage(String Path) {
        return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(Path));
    }
}
