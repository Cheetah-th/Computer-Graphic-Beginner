
//61050190
import java.awt.*;
import javax.swing.*;

public class DDALine extends JPanel {

	public static void main(String[] args) {
		DDALine m = new DDALine();

		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		DDALine(g, 100, 100, 400, 200);
		DDALine(g, 500, 300, 200, 200);
		DDALine(g, 100, 100, 200, 400);

	}

	public void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 5, 5);

	}

	private void DDALine(Graphics g, int x1, int y1, int x2, int y2) {
		double dx, dy, steps, x, y, k;
		double xc, yc;
		dx = x2 - x1;
		dy = y2 - y1;
		if (Math.abs(dx) > Math.abs(dy))
			steps = Math.abs(dx);
		else
			steps = Math.abs(dy);
		xc = (dx / steps);
		yc = (dy / steps);
		x = x1;
		y = y1;
		plot(g, (int) x, (int) y);
		for (k = 1; k <= steps; k++) {
			x = x + xc;
			y = y + yc;
			plot(g, (int) x, (int) y);
		}
	}

}