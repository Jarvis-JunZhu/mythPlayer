package mythPlayer.litter.exercise;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameTest2 {

	private static JPanel p;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("CardLayout");
		p = new JPanel();
		p.setLayout(new CardLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel label = new JLabel("first panel");
		p1.add(label);
		label = new JLabel("second panel");
		p2.add(label);

		p.add(p1, "first");
		p.add(p2, "second");

		((CardLayout) p.getLayout()).show(p, "first");

		JButton cButton = new JButton("change");
		cButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				((CardLayout) p.getLayout()).show(p, "second");
			}
		});

		jFrame.add(cButton, BorderLayout.NORTH);
		jFrame.add(p, BorderLayout.CENTER);
		jFrame.setSize(800, 600);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
