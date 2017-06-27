package util;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lenovo on 2017/6/27.
 */
public class Myframe extends Frame {

    public void launchFrame() {
        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        setLocation(100,100);
        setVisible(true);

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
