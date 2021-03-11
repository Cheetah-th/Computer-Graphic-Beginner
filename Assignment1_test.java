//61050190, 61050192
import java.awt.*;
import javax.swing.*;

public class Assignment1_test extends JPanel {

	public static void main(String[] args) {
		Assignment1_test m = new Assignment1_test();

		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		//student id
		
		
		//first chicken
		g.setColor(Color.orange);
		//chicken's right leg
		BresenhamAlgorithm(g, 410, 410, 410, 430);
		BresenhamAlgorithm(g, 420, 430, 390, 430);
		BresenhamAlgorithm(g, 400, 430, 400, 440);
		//chicken's left leg
		BresenhamAlgorithm(g, 450, 410, 450, 430);
		BresenhamAlgorithm(g, 440, 430, 470, 430);
		BresenhamAlgorithm(g, 460, 430, 460, 440);
		
		g.setColor(Color.lightGray);
		//chicken's body
		BresenhamAlgorithm(g, 410, 410, 450, 410);
		BresenhamAlgorithm(g, 450, 410, 470, 390);
		BresenhamAlgorithm(g, 470, 390, 470, 370);
		BresenhamAlgorithm(g, 470, 390, 490, 410);
		BresenhamAlgorithm(g, 490, 410, 490, 420);
		BresenhamAlgorithm(g, 490, 420, 500, 430);
		BresenhamAlgorithm(g, 500, 430, 510, 420);
		BresenhamAlgorithm(g, 510, 420, 510, 390);
		BresenhamAlgorithm(g, 510, 390, 500, 380);
		BresenhamAlgorithm(g, 500, 380, 500, 370);
		BresenhamAlgorithm(g, 500, 370, 470, 340);
		BresenhamAlgorithm(g, 470, 340, 470, 330);
		BresenhamAlgorithm(g, 470, 330, 480, 330);
		BresenhamAlgorithm(g, 480, 330, 490, 320);
		BresenhamAlgorithm(g, 490, 320, 490, 310);
		BresenhamAlgorithm(g, 490, 310, 470, 290);
		BresenhamAlgorithm(g, 470, 290, 470, 270);
		BresenhamAlgorithm(g, 470, 270, 450, 250);
		BresenhamAlgorithm(g, 450, 250, 410, 250);
		BresenhamAlgorithm(g, 410, 250, 390, 270);
		BresenhamAlgorithm(g, 390, 270, 390, 290);
		BresenhamAlgorithm(g, 390, 290, 370, 310);
		BresenhamAlgorithm(g, 370, 310, 370, 320);
		BresenhamAlgorithm(g, 370, 320, 380, 330);
		BresenhamAlgorithm(g, 380, 330, 390, 330);
		BresenhamAlgorithm(g, 390, 330, 390, 350);
		BresenhamAlgorithm(g, 390, 350, 380, 350);
		BresenhamAlgorithm(g, 380, 350, 360, 370);
		BresenhamAlgorithm(g, 360, 370, 360, 380);
		BresenhamAlgorithm(g, 360, 380, 350, 390);
		BresenhamAlgorithm(g, 350, 390, 350, 420);
		BresenhamAlgorithm(g, 350, 420, 360, 430);
		BresenhamAlgorithm(g, 360, 430, 370, 420);
		BresenhamAlgorithm(g, 370, 420, 370, 410);
		BresenhamAlgorithm(g, 370, 410, 390, 390);
		BresenhamAlgorithm(g, 390, 390, 390, 380);
		BresenhamAlgorithm(g, 390, 390, 410, 410);
		
		g.setColor(Color.red);
		//chicken's hair
		BresenhamAlgorithm(g, 420, 240, 450, 240);
		BresenhamAlgorithm(g, 420, 230, 450, 230);
		BresenhamAlgorithm(g, 430, 220, 440, 220);
		
		g.setColor(Color.black);
		//chicken's right eye
		BresenhamAlgorithm(g, 410, 300, 410, 300);
		//chicken's left eye
		BresenhamAlgorithm(g, 450, 300, 450, 300);
		
		g.setColor(Color.red);
		//chicken's upper mouth
		BresenhamAlgorithm(g, 420, 310, 440, 310);
		g.setColor(Color.orange);
		//chicken's lower mouth
		BresenhamAlgorithm(g, 420, 320, 440, 320);
		
		g.setColor(Color.red);
		//chicken's beard
		BresenhamAlgorithm(g, 430, 330, 430, 330);
		BresenhamAlgorithm(g, 420, 340, 440, 340);
		BresenhamAlgorithm(g, 410, 350, 450, 350);
		BresenhamAlgorithm(g, 410, 360, 420, 360);
		BresenhamAlgorithm(g, 440, 360, 450, 360);
		
		g.setColor(Color.white);
		//chicken's breast
		BresenhamAlgorithm(g, 430, 360, 430, 400);
		BresenhamAlgorithm(g, 420, 370, 420, 400);
		BresenhamAlgorithm(g, 440, 370, 440, 400);
		
		
		//second chicken
		g.setColor(Color.orange);
		//chicken's right leg
		BresenhamAlgorithm(g, 210, 410, 210, 430);
		BresenhamAlgorithm(g, 220, 430, 190, 430);
		BresenhamAlgorithm(g, 200, 430, 200, 440);
		//chicken's left leg
		BresenhamAlgorithm(g, 250, 410, 250, 430);
		BresenhamAlgorithm(g, 240, 430, 270, 430);
		BresenhamAlgorithm(g, 260, 430, 260, 440);
		
		g.setColor(Color.lightGray);
		//chicken's body
		BresenhamAlgorithm(g, 210, 410, 250, 410);
		BresenhamAlgorithm(g, 250, 410, 270, 390);
		BresenhamAlgorithm(g, 270, 390, 270, 370);
		BresenhamAlgorithm(g, 270, 390, 290, 410);
		BresenhamAlgorithm(g, 290, 410, 290, 420);
		BresenhamAlgorithm(g, 290, 420, 300, 430);
		BresenhamAlgorithm(g, 300, 430, 310, 420);
		BresenhamAlgorithm(g, 310, 420, 310, 390);
		BresenhamAlgorithm(g, 310, 390, 300, 380);
		BresenhamAlgorithm(g, 300, 380, 300, 370);
		BresenhamAlgorithm(g, 300, 370, 270, 340);
		BresenhamAlgorithm(g, 270, 340, 270, 330);
		BresenhamAlgorithm(g, 270, 330, 280, 330);
		BresenhamAlgorithm(g, 280, 330, 290, 320);
		BresenhamAlgorithm(g, 290, 320, 290, 310);
		BresenhamAlgorithm(g, 290, 310, 270, 290);
		BresenhamAlgorithm(g, 270, 290, 270, 270);
		BresenhamAlgorithm(g, 270, 270, 250, 250);
		BresenhamAlgorithm(g, 250, 250, 210, 250);
		BresenhamAlgorithm(g, 210, 250, 190, 270);
		BresenhamAlgorithm(g, 190, 270, 190, 290);
		BresenhamAlgorithm(g, 190, 290, 170, 310);
		BresenhamAlgorithm(g, 170, 310, 170, 320);
		BresenhamAlgorithm(g, 170, 320, 180, 330);
		BresenhamAlgorithm(g, 180, 330, 190, 330);
		BresenhamAlgorithm(g, 190, 330, 190, 350);
		BresenhamAlgorithm(g, 190, 350, 180, 350);
		BresenhamAlgorithm(g, 180, 350, 160, 370);
		BresenhamAlgorithm(g, 160, 370, 160, 380);
		BresenhamAlgorithm(g, 160, 380, 150, 390);
		BresenhamAlgorithm(g, 150, 390, 150, 420);
		BresenhamAlgorithm(g, 150, 420, 160, 430);
		BresenhamAlgorithm(g, 160, 430, 170, 420);
		BresenhamAlgorithm(g, 170, 420, 170, 410);
		BresenhamAlgorithm(g, 170, 410, 190, 390);
		BresenhamAlgorithm(g, 190, 390, 190, 380);
		BresenhamAlgorithm(g, 190, 390, 210, 410);
		
		g.setColor(Color.red);
		//chicken's hair
		BresenhamAlgorithm(g, 220, 240, 250, 240);
		BresenhamAlgorithm(g, 220, 230, 250, 230);
		BresenhamAlgorithm(g, 230, 220, 240, 220);
		
		g.setColor(Color.black);
		//chicken's right eye
		BresenhamAlgorithm(g, 210, 300, 210, 300);
		//chicken's left eye
		BresenhamAlgorithm(g, 250, 300, 250, 300);
		
		g.setColor(Color.red);
		//chicken's upper mouth
		BresenhamAlgorithm(g, 220, 310, 240, 310);
		g.setColor(Color.orange);
		//chicken's lower mouth
		BresenhamAlgorithm(g, 220, 320, 240, 320);
		
		g.setColor(Color.red);
		//chicken's beard
		BresenhamAlgorithm(g, 230, 330, 230, 330);
		BresenhamAlgorithm(g, 220, 340, 240, 340);
		BresenhamAlgorithm(g, 210, 350, 250, 350);
		BresenhamAlgorithm(g, 210, 360, 220, 360);
		BresenhamAlgorithm(g, 240, 360, 250, 360);
		
		g.setColor(Color.white);
		//chicken's breast
		BresenhamAlgorithm(g, 230, 360, 230, 400);
		BresenhamAlgorithm(g, 220, 370, 220, 400);
		BresenhamAlgorithm(g, 240, 370, 240, 400);

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
