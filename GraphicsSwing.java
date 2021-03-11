//61050190
import java.awt.*;
import javax.swing.*;

class GraphicsSwing extends JPanel {
	public static void main(String[] args) {
		GraphicsSwing m = new GraphicsSwing();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("First Swing");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	public void paintComponent(Graphics g) {
		g.drawString("Hello", 40, 40);
		g.setColor(Color.BLUE);
		g.fillRect(130, 30, 100, 80);
		g.drawOval(30, 130, 50, 60);
		g.setColor(Color.RED);
		g.drawLine(0, 0, 200, 30);
		g.fillOval(130, 130, 50, 60);
		g.drawArc(30, 200, 40, 50, 90, 60);
		g.fillArc(30, 130, 40, 50, 180, 40);

		g.setColor(Color.blue);// 1
		plot(g, 300, 300);
		g.setColor(Color.red);// 2
		plot(g, 150, 150);
		g.setColor(Color.black);// 3
		plot(g, 200, 200);
		g.setColor(Color.pink);// 4
		plot(g, 100, 100);
		g.setColor(Color.yellow);// 5
		plot(g, 400, 450);
		g.setColor(Color.gray);// 6
		plot(g, 111, 111);
		g.setColor(Color.green);// 7
		plot(g, 500, 450);
		g.setColor(Color.cyan);// 8
		plot(g, 439, 400);
		g.setColor(Color.magenta);// 9
		plot(g, 150, 450);
		g.setColor(Color.orange);// 10
		plot(g, 380, 450);
		
	}

	public void plot(Graphics g, int x, int y) {
		g.fillRect(x, y, 1, 1);
		
	}

}
