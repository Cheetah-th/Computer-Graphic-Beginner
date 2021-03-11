//61050190, 61050192
import java.awt.*;
import javax.swing.*;

class CG_1_1 extends JPanel {
	public static void main(String[] args) {
		CG_1_1 m = new CG_1_1();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("CG 1.1");
		f.setSize(20, 20);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	public void paintComponent(Graphics g) {
//		g.drawLine(0, 0, 0, 200);
//		g.drawLine(10, 0, 10, 200);
//		g.drawLine(20, 0, 20, 200);
//		g.drawLine(30, 0, 30, 200);
//		g.drawLine(40, 0, 40, 200);
//		g.drawLine(50, 0, 50, 200);
//		g.drawLine(60, 0, 60, 200);
//		g.drawLine(70, 0, 70, 200);
//		g.drawLine(80, 0, 80, 200);
//		g.drawLine(90, 0, 90, 200);
//		g.drawLine(100, 0, 100, 200);
//		g.drawLine(110, 0, 110, 200);
//		g.drawLine(120, 0, 120, 200);
//		g.drawLine(130, 0, 130, 200);
//		g.drawLine(140, 0, 140, 200);
//		g.drawLine(150, 0, 150, 200);
//		g.drawLine(160, 0, 160, 200);
//		g.drawLine(170, 0, 170, 200);
//		g.drawLine(180, 0, 180, 200);
//		g.drawLine(190, 0, 190, 200);
//		g.drawLine(200, 0, 200, 200);
//		g.drawLine(0, 0, 200, 0);
//		g.drawLine(0, 10, 200, 10);
//		g.drawLine(0, 20, 200, 20);
//		g.drawLine(0, 30, 200, 30);
//		g.drawLine(0, 40, 200, 40);
//		g.drawLine(0, 50, 200, 50);
//		g.drawLine(0, 60, 200, 60);
//		g.drawLine(0, 70, 200, 70);
//		g.drawLine(0, 80, 200, 80);
//		g.drawLine(0, 90, 200, 90);
//		g.drawLine(0, 100, 200, 100);
//		g.drawLine(0, 110, 200, 110);
//		g.drawLine(0, 120, 200, 120);
//		g.drawLine(0, 130, 200, 130);
//		g.drawLine(0, 140, 200, 140);
//		g.drawLine(0, 150, 200, 150);
//		g.drawLine(0, 160, 200, 160);
//		g.drawLine(0, 170, 200, 170);
//		g.drawLine(0, 180, 200, 180);
//		g.drawLine(0, 190, 200, 190);
//		g.drawLine(0, 200, 200, 200);
		
		g.setColor(Color.decode("#f9d155"));
		g.fillOval(1, 1, 18, 18);
		g.setColor(Color.decode("#00000"));
		g.fillOval(6, 6, 2, 4);
		g.fillOval(12, 6, 2, 4);
		g.fillOval(6, 6, 2, 4);
		g.fillRect(7, 14, 6, 1);
		
	}

	public void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 1, 1);
		
	}

}
