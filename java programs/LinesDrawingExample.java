import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
 

public class LinesDrawing extends JFrame {
 
    public LinesDrawing() {
        super("Lines Drawing Demo");
 
        setSize(460, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
		
		g2d.setColor(Color.RED);
		Stroke stroke = new BasicStroke(2f);
		g2d.setStroke(stroke);
		g2d.drawLine(120, 50, 360, 50);
		g2d.setColor(Color.GREEN);
		g2d.setStroke(new BasicStroke(4f));
		g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(6f));
		g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
 
    }
 
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LinesDrawing().setVisible(true);
            }
        });
    }
}