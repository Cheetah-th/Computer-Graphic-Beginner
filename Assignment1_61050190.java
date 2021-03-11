//61050190, 61050192
import java.awt.*;
import javax.swing.*;

public class Assignment1_61050190 extends JPanel {

	public static void main(String[] args) {
		Assignment1_61050190 m = new Assignment1_61050190();

		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		// sky color
		g.setColor(Color.cyan);
		for (int a = 0; a <= 600; a += 5) {
			BresenhamAlgorithm(g, 0, a, 600, a);
		}
		// ground color
		g.setColor(Color.orange);
		for (int a = 600; a >= 510; a -= 5) {
			BresenhamAlgorithm(g, 0, a, 600, a);
		}
		BresenhamAlgorithm(g, 25, 505, 585, 505);
		BresenhamAlgorithm(g, 30, 500, 575, 500);
		BresenhamAlgorithm(g, 40, 495, 560, 495);
		BresenhamAlgorithm(g, 255, 490, 375, 490);
		BresenhamAlgorithm(g, 255, 485, 375, 485);
		BresenhamAlgorithm(g, 255, 480, 375, 480);
		BresenhamAlgorithm(g, 270, 475, 360, 475);
		BresenhamAlgorithm(g, 275, 470, 350, 470);
		BresenhamAlgorithm(g, 280, 465, 340, 465);

		// student id
		// 6
		g.setColor(Color.black);
		BresenhamAlgorithm(g, 350, 30, 355, 30);
		BresenhamAlgorithm(g, 345, 35, 345, 35);
		BresenhamAlgorithm(g, 340, 40, 340, 40);
		BresenhamAlgorithm(g, 340, 45, 355, 45);
		BresenhamAlgorithm(g, 340, 50, 340, 55);
		BresenhamAlgorithm(g, 360, 50, 360, 55);
		BresenhamAlgorithm(g, 345, 60, 355, 60);

		// 1
		BresenhamAlgorithm(g, 375, 30, 375, 55);
		BresenhamAlgorithm(g, 370, 35, 370, 35);
		BresenhamAlgorithm(g, 370, 60, 380, 60);

		// 0
		BresenhamAlgorithm(g, 395, 30, 405, 30);
		BresenhamAlgorithm(g, 390, 35, 390, 55);
		BresenhamAlgorithm(g, 410, 35, 410, 55);
		BresenhamAlgorithm(g, 395, 60, 405, 60);

		// 5
		BresenhamAlgorithm(g, 420, 30, 440, 30);
		BresenhamAlgorithm(g, 420, 35, 420, 45);
		BresenhamAlgorithm(g, 420, 45, 435, 45);
		BresenhamAlgorithm(g, 440, 50, 440, 55);
		BresenhamAlgorithm(g, 425, 60, 435, 60);
		BresenhamAlgorithm(g, 420, 55, 420, 55);

		// 0
		BresenhamAlgorithm(g, 455, 30, 465, 30);
		BresenhamAlgorithm(g, 450, 35, 450, 55);
		BresenhamAlgorithm(g, 470, 35, 470, 55);
		BresenhamAlgorithm(g, 455, 60, 465, 60);

		// 1
		BresenhamAlgorithm(g, 485, 30, 485, 55);
		BresenhamAlgorithm(g, 480, 35, 480, 35);
		BresenhamAlgorithm(g, 480, 60, 490, 60);

		// 9
		BresenhamAlgorithm(g, 500, 30, 510, 30);
		BresenhamAlgorithm(g, 495, 35, 495, 40);
		BresenhamAlgorithm(g, 515, 35, 515, 40);
		BresenhamAlgorithm(g, 500, 45, 515, 45);
		BresenhamAlgorithm(g, 515, 50, 515, 55);
		BresenhamAlgorithm(g, 500, 60, 510, 60);

		// 0
		BresenhamAlgorithm(g, 530, 30, 540, 30);
		BresenhamAlgorithm(g, 525, 35, 525, 55);
		BresenhamAlgorithm(g, 545, 35, 545, 55);
		BresenhamAlgorithm(g, 530, 60, 540, 60);

		// 6
		BresenhamAlgorithm(g, 350, 80, 355, 80);
		BresenhamAlgorithm(g, 345, 85, 345, 85);
		BresenhamAlgorithm(g, 340, 90, 340, 90);
		BresenhamAlgorithm(g, 340, 95, 355, 95);
		BresenhamAlgorithm(g, 340, 100, 340, 105);
		BresenhamAlgorithm(g, 360, 100, 360, 105);
		BresenhamAlgorithm(g, 345, 110, 355, 110);

		// 1
		BresenhamAlgorithm(g, 375, 80, 375, 105);
		BresenhamAlgorithm(g, 370, 85, 370, 85);
		BresenhamAlgorithm(g, 370, 110, 380, 110);

		// 0
		BresenhamAlgorithm(g, 395, 80, 405, 80);
		BresenhamAlgorithm(g, 390, 85, 390, 105);
		BresenhamAlgorithm(g, 410, 85, 410, 105);
		BresenhamAlgorithm(g, 395, 110, 405, 110);

		// 5
		BresenhamAlgorithm(g, 420, 80, 440, 80);
		BresenhamAlgorithm(g, 420, 85, 420, 95);
		BresenhamAlgorithm(g, 420, 95, 435, 95);
		BresenhamAlgorithm(g, 440, 100, 440, 105);
		BresenhamAlgorithm(g, 425, 110, 435, 110);
		BresenhamAlgorithm(g, 420, 105, 420, 105);

		// 0
		BresenhamAlgorithm(g, 455, 80, 465, 80);
		BresenhamAlgorithm(g, 450, 85, 450, 105);
		BresenhamAlgorithm(g, 470, 85, 470, 105);
		BresenhamAlgorithm(g, 455, 110, 465, 110);

		// 1
		BresenhamAlgorithm(g, 485, 80, 485, 105);
		BresenhamAlgorithm(g, 480, 85, 480, 85);
		BresenhamAlgorithm(g, 480, 110, 490, 110);

		// 9
		BresenhamAlgorithm(g, 500, 80, 510, 80);
		BresenhamAlgorithm(g, 495, 85, 495, 90);
		BresenhamAlgorithm(g, 515, 85, 515, 90);
		BresenhamAlgorithm(g, 500, 95, 515, 95);
		BresenhamAlgorithm(g, 515, 100, 515, 105);
		BresenhamAlgorithm(g, 500, 110, 510, 110);

		// 2
		BresenhamAlgorithm(g, 530, 80, 540, 80);
		BresenhamAlgorithm(g, 525, 85, 525, 85);
		BresenhamAlgorithm(g, 545, 85, 545, 90);
		BresenhamAlgorithm(g, 540, 95, 540, 95);
		BresenhamAlgorithm(g, 535, 100, 535, 100);
		BresenhamAlgorithm(g, 530, 105, 530, 105);
		BresenhamAlgorithm(g, 525, 110, 545, 110);

		// dinosaur
		// head
		BresenhamAlgorithm(g, 200, 200, 320, 200);
		BresenhamAlgorithm(g, 200, 205, 320, 205);
		BresenhamAlgorithm(g, 200, 210, 320, 210);
		BresenhamAlgorithm(g, 190, 215, 330, 215);
		BresenhamAlgorithm(g, 190, 220, 330, 220);
		BresenhamAlgorithm(g, 190, 225, 330, 225);
		BresenhamAlgorithm(g, 190, 230, 330, 230);
		BresenhamAlgorithm(g, 190, 235, 330, 235);
		BresenhamAlgorithm(g, 190, 240, 330, 240);
		BresenhamAlgorithm(g, 190, 245, 330, 245);
		BresenhamAlgorithm(g, 190, 250, 330, 250);
		BresenhamAlgorithm(g, 190, 255, 330, 255);
		BresenhamAlgorithm(g, 190, 260, 330, 260);
		BresenhamAlgorithm(g, 190, 265, 330, 265);
		BresenhamAlgorithm(g, 190, 270, 330, 270);

		// eye
		g.setColor(Color.white);
		BresenhamAlgorithm(g, 220, 220, 230, 220);
		BresenhamAlgorithm(g, 220, 225, 230, 225);
		BresenhamAlgorithm(g, 220, 230, 230, 230);

		// mouth
		g.setColor(Color.black);
		BresenhamAlgorithm(g, 190, 275, 250, 275);
		BresenhamAlgorithm(g, 190, 280, 250, 280);
		BresenhamAlgorithm(g, 190, 285, 250, 285);
		BresenhamAlgorithm(g, 190, 290, 250, 290);
		BresenhamAlgorithm(g, 190, 295, 300, 295);
		BresenhamAlgorithm(g, 190, 300, 300, 300);
		BresenhamAlgorithm(g, 190, 305, 300, 305);

		// neck
		BresenhamAlgorithm(g, 180, 310, 235, 310);
		BresenhamAlgorithm(g, 180, 315, 235, 315);
		BresenhamAlgorithm(g, 180, 320, 235, 320);

		BresenhamAlgorithm(g, 160, 325, 235, 325);
		BresenhamAlgorithm(g, 160, 330, 235, 330);
		BresenhamAlgorithm(g, 160, 335, 235, 335);

		// arm
		BresenhamAlgorithm(g, 140, 340, 265, 340);
		BresenhamAlgorithm(g, 140, 345, 265, 345);
		BresenhamAlgorithm(g, 140, 350, 265, 350);
		BresenhamAlgorithm(g, 260, 355, 265, 355);
		BresenhamAlgorithm(g, 260, 360, 265, 360);

		// Body
		BresenhamAlgorithm(g, 130, 355, 235, 355);
		BresenhamAlgorithm(g, 130, 360, 235, 360);
		BresenhamAlgorithm(g, 130, 365, 235, 365);

		// tail
		BresenhamAlgorithm(g, 50, 310, 60, 310);
		BresenhamAlgorithm(g, 50, 315, 60, 315);
		BresenhamAlgorithm(g, 50, 320, 60, 320);
		BresenhamAlgorithm(g, 50, 325, 60, 325);
		BresenhamAlgorithm(g, 50, 330, 60, 330);
		BresenhamAlgorithm(g, 50, 335, 60, 335);
		BresenhamAlgorithm(g, 50, 340, 75, 340);
		BresenhamAlgorithm(g, 50, 345, 75, 345);
		BresenhamAlgorithm(g, 50, 350, 75, 350);
		BresenhamAlgorithm(g, 50, 355, 95, 355);
		BresenhamAlgorithm(g, 50, 360, 95, 360);
		BresenhamAlgorithm(g, 50, 365, 95, 365);
		BresenhamAlgorithm(g, 50, 370, 235, 370);
		BresenhamAlgorithm(g, 50, 375, 235, 375);
		BresenhamAlgorithm(g, 50, 380, 235, 380);

		BresenhamAlgorithm(g, 70, 385, 225, 385);
		BresenhamAlgorithm(g, 70, 390, 225, 390);
		BresenhamAlgorithm(g, 70, 395, 225, 395);

		BresenhamAlgorithm(g, 90, 400, 215, 400);
		BresenhamAlgorithm(g, 90, 405, 215, 405);
		BresenhamAlgorithm(g, 90, 410, 215, 410);

		BresenhamAlgorithm(g, 110, 415, 205, 415);
		BresenhamAlgorithm(g, 110, 420, 205, 420);
		BresenhamAlgorithm(g, 110, 425, 205, 425);

		// leg
		BresenhamAlgorithm(g, 120, 430, 190, 430);
		BresenhamAlgorithm(g, 120, 435, 190, 435);
		BresenhamAlgorithm(g, 120, 440, 190, 440);

		// right leg
		BresenhamAlgorithm(g, 120, 445, 150, 445);
		BresenhamAlgorithm(g, 120, 450, 150, 450);
		BresenhamAlgorithm(g, 120, 455, 150, 455);
		BresenhamAlgorithm(g, 120, 460, 130, 460);
		BresenhamAlgorithm(g, 120, 465, 130, 465);
		BresenhamAlgorithm(g, 120, 470, 130, 470);
		BresenhamAlgorithm(g, 120, 475, 130, 475);
		BresenhamAlgorithm(g, 120, 480, 130, 480);

		// right foot
		BresenhamAlgorithm(g, 120, 485, 140, 485);
		BresenhamAlgorithm(g, 120, 490, 140, 490);

		// left leg
		BresenhamAlgorithm(g, 170, 445, 190, 445);
		BresenhamAlgorithm(g, 170, 450, 190, 450);
		BresenhamAlgorithm(g, 170, 455, 190, 455);
		BresenhamAlgorithm(g, 170, 460, 180, 460);
		BresenhamAlgorithm(g, 170, 465, 180, 465);
		BresenhamAlgorithm(g, 170, 470, 180, 470);
		BresenhamAlgorithm(g, 170, 475, 180, 475);
		BresenhamAlgorithm(g, 170, 480, 180, 480);

		// left foot
		BresenhamAlgorithm(g, 170, 485, 190, 485);
		BresenhamAlgorithm(g, 170, 490, 190, 490);

		// ground
		BresenhamAlgorithm(g, 90, 490, 40, 490);
		BresenhamAlgorithm(g, 40, 490, 35, 495);
		BresenhamAlgorithm(g, 35, 495, 30, 495);
		BresenhamAlgorithm(g, 30, 495, 25, 500);
		BresenhamAlgorithm(g, 25, 500, 20, 505);
		BresenhamAlgorithm(g, 20, 505, 0, 505);

		BresenhamAlgorithm(g, 220, 490, 250, 490);
		BresenhamAlgorithm(g, 250, 490, 255, 475);
		BresenhamAlgorithm(g, 255, 475, 265, 475);
		BresenhamAlgorithm(g, 265, 475, 275, 465);
		BresenhamAlgorithm(g, 275, 465, 285, 465);
		BresenhamAlgorithm(g, 285, 465, 290, 460);
		BresenhamAlgorithm(g, 290, 460, 340, 460);
		BresenhamAlgorithm(g, 340, 460, 345, 465);
		BresenhamAlgorithm(g, 345, 465, 350, 465);
		BresenhamAlgorithm(g, 350, 465, 355, 470);
		BresenhamAlgorithm(g, 355, 470, 365, 475);
		BresenhamAlgorithm(g, 365, 475, 375, 475);
		BresenhamAlgorithm(g, 375, 475, 380, 490);
		BresenhamAlgorithm(g, 380, 490, 420, 490);
		BresenhamAlgorithm(g, 500, 490, 560, 490);
		BresenhamAlgorithm(g, 560, 490, 565, 495);
		BresenhamAlgorithm(g, 565, 495, 575, 495);
		BresenhamAlgorithm(g, 575, 495, 580, 500);
		BresenhamAlgorithm(g, 580, 500, 585, 500);
		BresenhamAlgorithm(g, 585, 500, 590, 505);
		BresenhamAlgorithm(g, 590, 505, 600, 505);

		BresenhamAlgorithm(g, 20, 540, 40, 540);
		BresenhamAlgorithm(g, 70, 520, 80, 520);
		BresenhamAlgorithm(g, 130, 520, 140, 520);
		BresenhamAlgorithm(g, 160, 520, 160, 520);
		BresenhamAlgorithm(g, 240, 510, 250, 510);
		BresenhamAlgorithm(g, 270, 540, 270, 540);
		BresenhamAlgorithm(g, 290, 510, 310, 510);
		BresenhamAlgorithm(g, 330, 520, 340, 520);
		BresenhamAlgorithm(g, 400, 510, 400, 510);
		BresenhamAlgorithm(g, 410, 530, 420, 530);
		BresenhamAlgorithm(g, 500, 510, 510, 510);
		BresenhamAlgorithm(g, 520, 540, 530, 540);
		BresenhamAlgorithm(g, 550, 540, 570, 540);
		BresenhamAlgorithm(g, 590, 530, 590, 530);

		// cactus
		BresenhamAlgorithm(g, 440, 520, 440, 160);
		BresenhamAlgorithm(g, 445, 520, 445, 160);
		BresenhamAlgorithm(g, 450, 520, 450, 150);
		BresenhamAlgorithm(g, 455, 520, 455, 150);
		BresenhamAlgorithm(g, 460, 520, 460, 150);
		BresenhamAlgorithm(g, 465, 520, 465, 150);
		BresenhamAlgorithm(g, 470, 520, 470, 150);
		BresenhamAlgorithm(g, 475, 520, 475, 150);
		BresenhamAlgorithm(g, 480, 520, 480, 160);
		BresenhamAlgorithm(g, 485, 520, 485, 160);

		BresenhamAlgorithm(g, 440, 365, 360, 365);
		BresenhamAlgorithm(g, 440, 370, 360, 370);
		BresenhamAlgorithm(g, 440, 375, 360, 375);
		BresenhamAlgorithm(g, 440, 380, 370, 380);
		BresenhamAlgorithm(g, 440, 385, 370, 385);
		BresenhamAlgorithm(g, 440, 390, 380, 390);
		BresenhamAlgorithm(g, 440, 395, 380, 395);

		BresenhamAlgorithm(g, 490, 355, 560, 355);
		BresenhamAlgorithm(g, 490, 360, 560, 360);
		BresenhamAlgorithm(g, 490, 365, 560, 365);
		BresenhamAlgorithm(g, 490, 370, 550, 370);
		BresenhamAlgorithm(g, 490, 375, 550, 375);
		BresenhamAlgorithm(g, 490, 380, 540, 380);
		BresenhamAlgorithm(g, 490, 385, 540, 385);

		BresenhamAlgorithm(g, 360, 360, 360, 270);
		BresenhamAlgorithm(g, 365, 360, 365, 270);
		BresenhamAlgorithm(g, 370, 360, 370, 260);
		BresenhamAlgorithm(g, 375, 360, 375, 260);
		BresenhamAlgorithm(g, 380, 360, 380, 260);
		BresenhamAlgorithm(g, 385, 360, 385, 260);
		BresenhamAlgorithm(g, 390, 360, 390, 270);
		BresenhamAlgorithm(g, 395, 360, 395, 270);

		BresenhamAlgorithm(g, 560, 350, 560, 250);
		BresenhamAlgorithm(g, 555, 350, 555, 250);
		BresenhamAlgorithm(g, 550, 350, 550, 240);
		BresenhamAlgorithm(g, 545, 350, 545, 240);
		BresenhamAlgorithm(g, 540, 350, 540, 240);
		BresenhamAlgorithm(g, 535, 350, 535, 240);
		BresenhamAlgorithm(g, 530, 350, 530, 250);
		BresenhamAlgorithm(g, 525, 350, 525, 250);

	}

	private void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 5, 5);

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
