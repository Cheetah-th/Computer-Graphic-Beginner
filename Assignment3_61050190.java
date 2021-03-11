//61050190, 61050192
import java.awt.*;
import javax.swing.*;

public class Assignment3_61050190 extends JPanel implements Runnable {

	double ErrorMove1 = 0;
	double ErrorMove2 = 0;
	double ErrorMove3 = 0;
	double ErrorMove4 = 0;
	double ErrorMove5 = 0;
	// Move 50 pixel per second
	int direct1 = 50;
	// Move 150 pixel per second
	int direct2 = 150;
	// Move 80 pixel per second
	int direct3 = 80;
	// Move 300 pixel per second
	int direct4 = 300;
	// Move 100 pixel per second
	int direct5 = 180;

	public static void main(String[] args) {
		Assignment3_61050190 m = new Assignment3_61050190();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		(new Thread(m)).start();

	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fillRect(0, 0, 600, 600);
		g2.setColor(Color.WHITE);
		g2.translate(ErrorMove1, 0);
		BresenhamAlgorithm(g, 0, 0, 0, 100);
		BresenhamAlgorithm(g, 10, 0, 30, 0);
		BresenhamAlgorithm(g, 10, 50, 20, 50);
		BresenhamAlgorithm(g, 10, 100, 30, 100);

		BresenhamAlgorithm(g, 50, 0, 50, 100);
		BresenhamAlgorithm(g, 60, 0, 80, 0);
		BresenhamAlgorithm(g, 80, 10, 80, 50);
		BresenhamAlgorithm(g, 70, 50, 60, 50);
		BresenhamAlgorithm(g, 60, 60, 80, 100);

		BresenhamAlgorithm(g, 100, 0, 100, 100);
		BresenhamAlgorithm(g, 110, 0, 130, 0);
		BresenhamAlgorithm(g, 130, 10, 130, 50);
		BresenhamAlgorithm(g, 120, 50, 110, 50);
		BresenhamAlgorithm(g, 110, 60, 130, 100);

		BresenhamAlgorithm(g, 150, 0, 180, 0);
		BresenhamAlgorithm(g, 150, 10, 150, 100);
		BresenhamAlgorithm(g, 180, 10, 180, 100);
		BresenhamAlgorithm(g, 160, 100, 170, 100);

		BresenhamAlgorithm(g, 200, 0, 200, 100);
		BresenhamAlgorithm(g, 210, 0, 230, 0);
		BresenhamAlgorithm(g, 230, 10, 230, 50);
		BresenhamAlgorithm(g, 220, 50, 210, 50);
		BresenhamAlgorithm(g, 210, 60, 230, 100);
		g2.translate(-ErrorMove1, 0);

		g2.translate(ErrorMove2, 0);
		BresenhamAlgorithm(g, 0, 200, 0, 300);
		BresenhamAlgorithm(g, 10, 200, 30, 200);
		BresenhamAlgorithm(g, 10, 250, 20, 250);
		BresenhamAlgorithm(g, 10, 300, 30, 300);

		BresenhamAlgorithm(g, 50, 200, 50, 300);
		BresenhamAlgorithm(g, 60, 200, 80, 200);
		BresenhamAlgorithm(g, 80, 210, 80, 250);
		BresenhamAlgorithm(g, 70, 250, 60, 250);
		BresenhamAlgorithm(g, 60, 260, 80, 300);

		BresenhamAlgorithm(g, 100, 200, 100, 300);
		BresenhamAlgorithm(g, 110, 200, 130, 200);
		BresenhamAlgorithm(g, 130, 210, 130, 250);
		BresenhamAlgorithm(g, 120, 250, 110, 250);
		BresenhamAlgorithm(g, 110, 260, 130, 300);

		BresenhamAlgorithm(g, 150, 200, 180, 200);
		BresenhamAlgorithm(g, 150, 210, 150, 300);
		BresenhamAlgorithm(g, 180, 210, 180, 300);
		BresenhamAlgorithm(g, 160, 300, 170, 300);

		BresenhamAlgorithm(g, 200, 200, 200, 300);
		BresenhamAlgorithm(g, 210, 200, 230, 200);
		BresenhamAlgorithm(g, 230, 210, 230, 250);
		BresenhamAlgorithm(g, 220, 250, 210, 250);
		BresenhamAlgorithm(g, 210, 260, 230, 300);
		g2.translate(-ErrorMove2, 0);

		g2.translate(ErrorMove3, 0);
		BresenhamAlgorithm(g, 0, 400, 0, 500);
		BresenhamAlgorithm(g, 10, 400, 30, 400);
		BresenhamAlgorithm(g, 10, 450, 20, 450);
		BresenhamAlgorithm(g, 10, 500, 30, 500);

		BresenhamAlgorithm(g, 50, 400, 50, 500);
		BresenhamAlgorithm(g, 60, 400, 80, 400);
		BresenhamAlgorithm(g, 80, 410, 80, 450);
		BresenhamAlgorithm(g, 70, 450, 60, 450);
		BresenhamAlgorithm(g, 60, 460, 80, 500);

		BresenhamAlgorithm(g, 100, 400, 100, 500);
		BresenhamAlgorithm(g, 110, 400, 130, 400);
		BresenhamAlgorithm(g, 130, 410, 130, 450);
		BresenhamAlgorithm(g, 120, 450, 110, 450);
		BresenhamAlgorithm(g, 110, 460, 130, 500);

		BresenhamAlgorithm(g, 150, 400, 180, 400);
		BresenhamAlgorithm(g, 150, 410, 150, 500);
		BresenhamAlgorithm(g, 180, 410, 180, 500);
		BresenhamAlgorithm(g, 160, 500, 170, 500);

		BresenhamAlgorithm(g, 200, 400, 200, 500);
		BresenhamAlgorithm(g, 210, 400, 230, 400);
		BresenhamAlgorithm(g, 230, 410, 230, 450);
		BresenhamAlgorithm(g, 220, 450, 210, 450);
		BresenhamAlgorithm(g, 210, 460, 230, 500);
		g2.translate(-ErrorMove3, 0);

		g2.translate(ErrorMove4, 0);
		BresenhamAlgorithm(g, 0, 300, 0, 400);
		BresenhamAlgorithm(g, 10, 300, 30, 300);
		BresenhamAlgorithm(g, 10, 350, 20, 350);
		BresenhamAlgorithm(g, 10, 400, 30, 400);

		BresenhamAlgorithm(g, 50, 300, 50, 400);
		BresenhamAlgorithm(g, 60, 300, 80, 300);
		BresenhamAlgorithm(g, 80, 310, 80, 350);
		BresenhamAlgorithm(g, 70, 350, 60, 350);
		BresenhamAlgorithm(g, 60, 360, 80, 400);

		BresenhamAlgorithm(g, 100, 300, 100, 400);
		BresenhamAlgorithm(g, 110, 300, 130, 300);
		BresenhamAlgorithm(g, 130, 310, 130, 350);
		BresenhamAlgorithm(g, 120, 350, 110, 350);
		BresenhamAlgorithm(g, 110, 360, 130, 400);

		BresenhamAlgorithm(g, 150, 300, 180, 300);
		BresenhamAlgorithm(g, 150, 310, 150, 400);
		BresenhamAlgorithm(g, 180, 310, 180, 400);
		BresenhamAlgorithm(g, 160, 400, 170, 400);

		BresenhamAlgorithm(g, 200, 300, 200, 400);
		BresenhamAlgorithm(g, 210, 300, 230, 300);
		BresenhamAlgorithm(g, 230, 310, 230, 350);
		BresenhamAlgorithm(g, 220, 350, 210, 350);
		BresenhamAlgorithm(g, 210, 360, 230, 400);
		g2.translate(-ErrorMove4, 0);

		g2.translate(ErrorMove5, 0);
		BresenhamAlgorithm(g, 0, 100, 0, 200);
		BresenhamAlgorithm(g, 10, 100, 30, 100);
		BresenhamAlgorithm(g, 10, 150, 20, 150);
		BresenhamAlgorithm(g, 10, 200, 30, 200);

		BresenhamAlgorithm(g, 50, 100, 50, 200);
		BresenhamAlgorithm(g, 60, 100, 80, 100);
		BresenhamAlgorithm(g, 80, 110, 80, 150);
		BresenhamAlgorithm(g, 70, 150, 60, 150);
		BresenhamAlgorithm(g, 60, 160, 80, 200);

		BresenhamAlgorithm(g, 100, 100, 100, 200);
		BresenhamAlgorithm(g, 110, 100, 130, 100);
		BresenhamAlgorithm(g, 130, 110, 130, 150);
		BresenhamAlgorithm(g, 120, 150, 110, 150);
		BresenhamAlgorithm(g, 110, 160, 130, 200);

		BresenhamAlgorithm(g, 150, 100, 180, 100);
		BresenhamAlgorithm(g, 150, 110, 150, 200);
		BresenhamAlgorithm(g, 180, 110, 180, 200);
		BresenhamAlgorithm(g, 160, 200, 170, 200);

		BresenhamAlgorithm(g, 200, 100, 200, 200);
		BresenhamAlgorithm(g, 210, 100, 230, 100);
		BresenhamAlgorithm(g, 230, 110, 230, 150);
		BresenhamAlgorithm(g, 220, 150, 210, 150);
		BresenhamAlgorithm(g, 210, 160, 230, 200);
		g2.translate(-ErrorMove5, 0);

	}

	public void run() {
		double lastTime = System.currentTimeMillis();
		double currentTime, elapsedTime;
		double startTime = System.currentTimeMillis();
		while (true) {
			currentTime = System.currentTimeMillis();
			elapsedTime = currentTime - lastTime;

			// TODO: update logics
			// Change milliseconds to seconds

			if (ErrorMove1 < 0 || ErrorMove1 > 360) {
				direct1 = (-direct1);
			}
			ErrorMove1 += direct1 * elapsedTime / 1000.0;

			if (ErrorMove2 < 0 || ErrorMove2 > 360) {
				direct2 = (-direct2);
			}
			ErrorMove2 += direct2 * elapsedTime / 1000.0;

			if (ErrorMove3 < 0 || ErrorMove3 > 360) {
				direct3 = (-direct3);
			}
			ErrorMove3 += direct3 * elapsedTime / 1000.0;

			if (ErrorMove4 < 0 || ErrorMove4 > 360) {
				direct4 = (-direct4);
			}
			ErrorMove4 += direct4 * elapsedTime / 1000.0;

			if (ErrorMove5 < 0 || ErrorMove5 > 360) {
				direct5 = (-direct5);
			}
			ErrorMove5 += direct5 * elapsedTime / 1000.0;

			// Display
			repaint();
			lastTime = currentTime;
			// take a little nap: 60fps
			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}

	}

	private void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 10, 10);

	}

	private void BresenhamAlgorithm(Graphics g, int x1, int y1, int x2, int y2) {
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
