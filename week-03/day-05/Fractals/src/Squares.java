import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {
        drawLevel(graphics, 0, 0, 500, 500, 7);

    }
    public static void drawLevel(Graphics graphics,double xCorner, double yCorner, double width, double height, int count){
        if (count == 1){
    } else {
            graphics.drawLine((int)(xCorner + width/3),(int)yCorner,(int)(xCorner + width/3),(int)(yCorner+height));
//            graphics.drawLine((int)(xCorner + 2 * width/3),(int)yCorner,(int)(xCorner + 2 * width/3),(int)(yCorner+height));
//            graphics.drawLine((int)(xCorner),(int)(yCorner + height / 3),(int)(xCorner + width),(int)(yCorner+height /3 ));
//            graphics.drawLine((int)(xCorner),(int)(yCorner + 2 * height / 3),(int)(xCorner + width),(int)(yCorner + 2 * height / 3));
//            drawLevel(graphics, xCorner + width / 3, yCorner, width / 3.0, height / 3.0, count -1);
//            drawLevel(graphics, xCorner, yCorner + height / 3.0, width / 3.0, height / 3.0, count -1);
//            drawLevel(graphics, xCorner + 2 * width / 3.0, yCorner + height / 3.0, width / 3.0, height / 3.0, count -1);
//            drawLevel(graphics, xCorner + height / 3, yCorner + 2 * height / 3.0, width / 3.0, height / 3.0, count -1);
        }
}
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