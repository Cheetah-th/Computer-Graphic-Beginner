//61050190
import java.awt.*;
import javax.swing.*;

public class Bresenham extends JPanel {

	public static void main(String[] args) {
		Bresenham m = new Bresenham();

		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		BresenhemLine(g, 100, 100, 400, 200);
		BresenhemLine(g, 500, 300, 200, 200);
		BresenhemLine(g, 100, 100, 200, 400);

	}

	private void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 5, 5);

	}

	private void BresenhemLine(Graphics g, int x1, int y1, int x2, int y2) {
		int x, y;
		int dx, dy;
		int sx, sy;
		int balance;

		if (x2 >= x1) {
			dx = x2 - x1;
			sx = 1;
		} else {
			dx = x1 - x2;
			sx = -1;
		}

		if (y2 >= y1) {
			dy = y2 - y1;
			sy = 1;
		} else {
			dy = y1 - y2;
			sy = -1;
		}

		x = x1;
		y = y1;

		if (dx >= dy) {
			balance = dy - dx;

			while (x != x2) {
				plot(g, x, y);
				if (balance >= 0) {
					y += sy;
					balance -= dx;
				}
				balance += dy;
				x += sx;
			}
			plot(g, x, y);
		} else {
			balance = dx - dy;

			while (y != y2) {
				plot(g, x, y);
				if (balance >= 0) {
					x += sx;
					balance -= dy;
				}
				balance += dx;
				y += sy;
			}
			plot(g, x, y);
		}
		
	}

}
