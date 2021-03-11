import java.awt.*;
import javax.swing.*;
import java.util.*;

class Assignment3_test extends JPanel implements Runnable {
	private static LinkedList<Animation> all_obj = new LinkedList<Animation>();

	public static void main(String[] args) {
		Assignment3_test m = new Assignment3_test();
		JFrame f = new JFrame("First Swing");
		f.add(m);
		f.setSize(730 + 15, 486 + 37);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		all_obj.add(new Balloon3(17, 135));
		all_obj.add(new Balloon3(42, 113));
		all_obj.add(new Balloon3(76, 193));
		all_obj.add(new Balloon3(100, 167));
		all_obj.add(new Balloon3(169, 142));
		all_obj.add(new Balloon3(185, 193));
		all_obj.add(new Balloon3(276, 110));
		all_obj.add(new Balloon3(279, 117));
		all_obj.add(new Balloon3(313, 132));
		all_obj.add(new Balloon3(321, 70));
		all_obj.add(new Balloon3(376, 202));
		all_obj.add(new Balloon3(442, 161));
		all_obj.add(new Balloon3(476, 198));
		all_obj.add(new Balloon3(532, 165));
		all_obj.add(new Balloon3(558, 191));
		all_obj.add(new Balloon3(623, 165));
		all_obj.add(new Balloon3(639, 187));
		all_obj.add(new Balloon3(639, 122));
		all_obj.add(new Balloon3(679, 185));
		all_obj.add(new Balloon3(697, 156));

		all_obj.add(new Balloon2(68, 118));
		all_obj.add(new Balloon2(145, 165));
		all_obj.add(new Balloon2(260, 33));
		all_obj.add(new Balloon2(417, 180));
		all_obj.add(new Balloon2(492, 134));
		all_obj.add(new Balloon2(591, 165));
		all_obj.add(new Balloon2(665, 86));

		all_obj.add(new Balloon1(17, 166));
		all_obj.add(new Balloon1(364, 103));
		all_obj.add(new Balloon1(639, 231));

		(new Thread(m)).start();

	}

	@Override
	public void run() {
		double lastTime = System.currentTimeMillis();
		double currentTime, elapsedTime;
		double startTime = System.currentTimeMillis();

		while (true) {
			currentTime = System.currentTimeMillis();
			elapsedTime = currentTime - lastTime;
			// TODO: update logics
			for (Animation s : all_obj) {
				s.update();
			}

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

	@Override
	protected void paintComponent(Graphics g) {
		BG bg = new BG();
		bg.display(g);

		for (Animation s : all_obj) {
			s.display(g);
		}

	}

}