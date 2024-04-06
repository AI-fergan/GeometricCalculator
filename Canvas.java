import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas {
    public static void paint(ArrayList<Shape> shapes) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shapes Example");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    for(int i = 0; i < shapes.size(); i++) {
                    	shapes.get(i).draw(g);
                    }
                }
            };
            frame.add(panel);
        });
    }
    
    public static void drawCircle(Graphics g, Circle circle) {
    	// Draw a circle
        g.setColor(circle._color);
        g.fillOval(circle.getPoints()[0].getX(), circle.getPoints()[0].getY(), (int)circle.getRadius(), (int)circle.getRadius());
    }
    
    public static void drawLine(Graphics g, Line line) {
    	// Draw a line
        g.setColor(line._color);
        g.drawLine(line.getPoints()[0].getX(), line.getPoints()[0].getY(), line.getPoints()[1].getX(), line.getPoints()[1].getY());
    }
    
    public static void drawTriangle(Graphics g, Triangle triangle) {
    	int[] xPoints = {triangle.getPoints()[0].getX(), triangle.getPoints()[1].getX(), triangle.getPoints()[2].getX()};
        int[] yPoints = {triangle.getPoints()[0].getY(), triangle.getPoints()[1].getY(), triangle.getPoints()[2].getY()};
        
        // Draw a triangle
        g.setColor(triangle._color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
