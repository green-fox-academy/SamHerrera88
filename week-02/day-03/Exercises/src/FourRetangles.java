import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRetangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            graphics.setColor(new Color(randomColor(), randomColor(), randomColor(), randomColor()));
            graphics.fillRect(randomCoordinate(), randomCoordinate(), randomCoordinate(), randomCoordinate());
        }
    }

    public static int randomColor() {
        return ((int) Math.floor(Math.random() * 256));

    }

    public static int randomCoordinate() {
        return ((int) Math.floor(Math.random() * 300));
    }

    public static int randomSide() {
        return ((int) Math.floor(Math.random() * 141 + 10));

    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
