//61050190
import java.awt.*;
import javax.swing.*;

public class Midpoint_Circle extends JPanel {

	public static void main(String[] args) {
		Midpoint_Circle m = new Midpoint_Circle();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		MidpointCircleAlgorithm(g, 300, 300, 100);

	}

	private void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 5, 5);

	}

	public void MidpointCircleAlgorithm(Graphics g, int a, int b, int r) {
		int x = 0;
		int y = r;
		int dx = 2 * x;
		int dy = 2 * y;
		int d = 1 - r;
		while (x <= y) {
			plot(g, x + a, y + b);
			plot(g, y + a, x + b);
			plot(g, y + a, -x + b);
			plot(g, x + a, -y + b);
			plot(g, -x + a, -y + b);
			plot(g, -y + a, -x + b);
			plot(g, -y + a, x + b);
			plot(g, -x + a, y + b);

			x = x + 1;
			dx = dx + 2;
			d = d + dx + 1;
			if (d >= 0) {
				y = y - 1;
				dy = dy - 2;
				d = d - dy;
			}
		}

	}

}