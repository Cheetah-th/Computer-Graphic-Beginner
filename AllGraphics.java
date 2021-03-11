//61050190
import java.awt.*;
import javax.swing.*;

public class AllGraphics extends JPanel implements Runnable {

	double circleMove = 0;
	double squareRotate = 0;
	int direct = 50;

	public static void main(String[] args) {
		AllGraphics m = new AllGraphics();
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
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, 600, 600);
		g2.setColor(Color.BLACK);
		g2.translate(circleMove, 0);
		g2.drawOval(0, 0, 100, 100);
		g2.translate(-circleMove, 0);
		g2.rotate(squareRotate, 300, 300);
		g2.drawRect(200, 200, 200, 200);

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
			// Move 50 pixel per second
			if (circleMove < 0 || circleMove > 500) {
				direct = (-direct);
			}
			circleMove += direct * elapsedTime / 1000.0;
			// Rotate 0.5 radians per second
			squareRotate += 0.5 * elapsedTime / 1000.0;

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

}
