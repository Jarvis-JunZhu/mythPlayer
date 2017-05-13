package mythPlayer.litter.exercise;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class DemoPanel extends JFrame {

	private JPanel	contentPane;
	private JPanel	pnlDemo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoPanel frame = new DemoPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoPanel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\文件图片\\timg.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pnlDemo = new JPanel();
		pnlDemo.setToolTipText("sdfsfs");
		pnlDemo.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlDemo.setBackground(Color.YELLOW);
		pnlDemo.setBounds(14, 13, 404, 227);
		contentPane.add(pnlDemo);
		pnlDemo.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(59, 152, 113, 27);
		pnlDemo.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(254, 152, 113, 27);
		pnlDemo.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.PINK);
		panel.setBounds(69, 26, 272, 78);
		pnlDemo.add(panel);

		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
	}

}
