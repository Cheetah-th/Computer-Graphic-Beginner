//61050190
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class Graphics_2D extends JPanel {
	public static void main(String[] args) {
		Graphics_2D m = new Graphics_2D();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
	
	double x = Math.PI / 6;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.setTransform(new AffineTransform(Math.cos(x), -Math.sin(x), Math.sin(x), Math.cos(x),
				300 * (1 - Math.cos(x)) - 300 * Math.sin(x), 300 * (1 - Math.cos(x)) + 300 * Math.sin(x)));
		g2.drawRect(200, 200, 200, 200);
		
//		Clockwise
//		g2.setTransform(new AffineTransform(Math.cos(zeta), Math.sin(zeta), -Math.sin(zeta), Math.cos(zeta),
//		Px * (1 - Math.cos(zeta)) + Py * Math.sin(zeta), Py * (1 - Math.cos(zeta)) - Px * Math.sin(zeta)));
		
//		Counter-Clockwise
//		g2.setTransform(new AffineTransform(Math.cos(zeta), -Math.sin(zeta), Math.sin(zeta), Math.cos(zeta),
//				Px * (1 - Math.cos(zeta)) - Py * Math.sin(zeta), Py * (1 - Math.cos(zeta)) + Px * Math.sin(zeta)));

	}

	public void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 1, 1);

	}

}
