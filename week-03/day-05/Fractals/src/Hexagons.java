import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
    public static void mainDraw(Graphics graphics) {
        drawLevel(graphics, 0, 0, 500, 6);


    }

    public static void drawLevel(Graphics graphics, double xCorner, double yCorner, double width, int count) {
        double a = width / 2.0;
        double l = (a * Math.sqrt(3.0) / 2);

        if (count == 1) {
        } else {
            graphics.drawLine((int) (xCorner + (width / 4)), (int) yCorner, (int) xCorner, (int) (yCorner + l));
            graphics.drawLine((int) (xCorner), (int) (yCorner + l), (int) (xCorner + (width / 4)), (int) (yCorner + (2 * l)));
            graphics.drawLine((int) (xCorner + (width / 4)), (int) (yCorner + (2 * l)), (int) (xCorner + (3 * width / 4)), (int) (yCorner + (2 * l)));
            graphics.drawLine((int) (xCorner + (3 * width / 4)), (int) (yCorner + (2 * l)), (int) (xCorner + width), (int) (yCorner + l));
            graphics.drawLine((int) (xCorner + width), (int) (yCorner + l), (int) (xCorner + (3 * width / 4)), (int) (yCorner));
            graphics.drawLine((int) (xCorner + (3 * width / 4)), (int) (yCorner), (int) (xCorner + (width / 4)), (int) (yCorner));
            drawLevel(graphics, xCorner + (width / 8), yCorner, width / 2.0, count - 1);
            drawLevel(graphics, xCorner + (width / 8), yCorner + l, width / 2.0, count - 1);
            drawLevel(graphics, xCorner + (width / 2), yCorner + (l / 2), width / 2.0, count - 1);

        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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