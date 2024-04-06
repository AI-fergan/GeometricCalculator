import javax.swing.*;
import java.awt.*;

public class Canvas {
    public static void paint(Shape[] shapes) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shapes Example");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    // Draw a rectangle
                    g.setColor(Color.RED);
                    g.fillRect(50, 50, 100, 50);

                    // Draw a circle
                    g.setColor(Color.BLUE);
                    g.fillOval(200, 100, 50, 50);
                }
            };
            frame.add(panel);
        });
    }
}
