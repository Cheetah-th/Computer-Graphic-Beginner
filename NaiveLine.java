//61050190
import java.awt.*;
import javax.swing.*;

public class NaiveLine extends JPanel {
	
	public static void main(String[] args) {
		NaiveLine m = new NaiveLine();
		
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		NaiveLine(g, 100, 100, 400, 200);
		NaiveLine(g, 500, 300, 200, 200);
		NaiveLine(g, 100, 100, 200, 400);

	}

	public void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 5, 5);

	}

	private void NaiveLine(Graphics g, int x1, int y1, int x2, int y2) {
		if (y2 < y1) {
			int tmp = x2;
			x2 = x1;
			x1 = tmp;

			tmp = y2;
			y2 = y1;
			y1 = tmp;
		}

		double dx = x2 - x1;
		double dy = y2 - y1;
		double b = (y1 - (dy / dx) * x1);
		for (int x = x1; x <= x2; x++) {
			double y = ((dy / dx) * x + b);
			plot(g, x, (int) Math.round(y));
		}

	}

}