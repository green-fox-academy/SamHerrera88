
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopStar {
    static int CANVAS_SIDE = 320;

    public static void mainDraw(Graphics graphics) {
        drawEnvelopeStar(graphics);
    }

    public static void drawEnvelopeStar(Graphics graphics) {
        int subCanvas = CANVAS_SIDE / 2;
        int rows = 2;
        int columns = 2;

        for (int i = 0; i <= columns; i++) {
            for (int j = 0; j <= rows; j++) {
                graphics.setColor(Color.GREEN);
                //up-left
                for (int w = subCanvas / 20; w < subCanvas; w += subCanvas / 20) {
                    graphics.drawLine(w, subCanvas, subCanvas, subCanvas - w);
                }
                //up-right
                for (int x = subCanvas / 20; x < subCanvas; x += subCanvas / 20) {
                    graphics.drawLine(subCanvas, x, x + subCanvas, subCanvas);
                }
                //down-left
                for (int y = subCanvas / 20; y < subCanvas; y += subCanvas / 20) {
                    graphics.drawLine(y, subCanvas, subCanvas, subCanvas + y);
                }
                //down-right
                for (int z = subCanvas / 20; z < subCanvas; z += subCanvas / 20) {
                    graphics.drawLine(CANVAS_SIDE - z, subCanvas, subCanvas, subCanvas + z);
                }
            }
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
