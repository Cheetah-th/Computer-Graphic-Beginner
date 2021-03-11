import java.awt.*;

abstract class Animation {
	protected int x;
	protected int y;

	public abstract void update();

	public abstract void display(Graphics g);

}