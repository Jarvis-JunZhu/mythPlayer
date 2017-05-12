package mythPlayer.litter.exercise;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RocketPanel extends JPanel {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("Rocket");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jframe.getContentPane().add(new RocketPanel());
		jframe.pack();
		jframe.setVisible(true);
	}

	private int[]	xRocket	= { 100, 120, 120, 130, 130, 70, 70, 80, 80 };
	private int[]	yRocket	= { 15, 40, 115, 125, 150, 150, 125, 115, 40 };

	private int[]	xWindow	= { 95, 105, 110, 90 };
	private int[]	yWindow	= { 45, 45, 70, 70 };

	private int[]	xFlame	= { 70, 70, 75, 80, 90, 100, 110, 115, 120, 130, 130 };
	private int[]	yFlame	= { 155, 170, 165, 190, 170, 175, 160, 185, 160, 175, 155 };

	public RocketPanel() {
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(200, 200));

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.red);
		g.fillPolygon(xRocket, yRocket, xRocket.length);

		g.setColor(Color.black);
		g.fillPolygon(xWindow, yWindow, xWindow.length);

		// g.drawPolyline(xFlame, yFlame, xFlame.length);

		g.setColor(Color.red);
		g.drawPolyline(xFlame, yFlame, xFlame.length);

	}
}
