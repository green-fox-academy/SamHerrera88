import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int canvasSide = 320;


        graphics.setColor(Color.MAGENTA);
        for (int x = canvasSide / 20; x < canvasSide; x += canvasSide / 20) {
            graphics.drawLine(x, 0, canvasSide, x);
        }
        graphics.setColor(Color.green);
        for (int y = canvasSide / 20; y < canvasSide; y += canvasSide / 20) {
            graphics.drawLine(0, y, y, canvasSide);
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}