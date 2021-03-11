//61050190
import java.awt.*;
import javax.swing.*;

class Midpoint_Ellipse extends JPanel {
	public static void main(String[] args) {
		Midpoint_Ellipse m = new Midpoint_Ellipse();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("ellipse");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	public void paintComponent(Graphics g) {
		midpointEllipse(g, 280, 280, 150, 100);
		
	}
	
	private void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 5, 5);
		
	}

	public void midpointEllipse(Graphics g, int xc, int yc, int a, int b) {
		int a2 = a * a, b2 = b * b;
		int twoA2 = 2 * a2, twoB2 = 2 * b2;
		int x = 0;
		int y = b;
		int D = Math.round(b2 - a2 * b + a2 / 4);
		int Dx = 0, Dy = twoA2 * y;
		while (Dx <= Dy) {
			plot(g, x + xc, y + yc);
			plot(g, -x + xc, y + yc);
			plot(g, x + xc, -y + yc);
			plot(g, -x + xc, -y + yc);
			x = x + 1;
			Dx = Dx + twoB2;
			D = D + Dx + b2;
			if (D >= 0) {
				y = y - 1;
				Dy = Dy - twoA2;
				D = D - Dy;
				
			}
		}
		
		x = a;
		y = 0;
		D = Math.round(a2 - b2 * a + b2 / 4);
		Dx = twoB2 * x;
		Dy = 0;
		while (Dx >= Dy) {
			plot(g, x + xc, y + yc);
			plot(g, -x + xc, y + yc);
			plot(g, x + xc, -y + yc);
			plot(g, -x + xc, -y + yc);
			y = y + 1;
			Dy = Dy + twoA2;
			D = D + Dy + a2;
			if (D >= 0) {
				x = x - 1;
				Dx = Dx - twoB2;
				D = D - Dx;
				
			}
		}
	}

}