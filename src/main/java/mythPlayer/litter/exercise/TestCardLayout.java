package mythPlayer.litter.exercise;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * 图片预览功能，有第一个、上一个、下一个、最后一个
 * 
 * @author Jarvis
 *
 */
public class TestCardLayout extends JFrame {

	private JPanel		contentPane;
	private ViewImage	lbl4;
	private ViewImage	lbl3;
	private ViewImage	lbl2;
	private ViewImage	lbl1;
	private JButton		btnFirst;
	private JButton		btnNext;
	private JButton		btnPrev;
	private JButton		btnLast;
	private CardLayout	cardLayout;
	private JPanel		panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestCardLayout frame = new TestCardLayout();
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
	public TestCardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(473, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(68, 13, 310, 167);
		contentPane.add(panel);
		this.cardLayout = new CardLayout(0, 0);
		panel.setLayout(cardLayout);

		lbl4 = new ViewImage();
		lbl4.setImageFile("G:\\文件图片\\4.jpg");
		panel.add(lbl4, "4");

		lbl3 = new ViewImage();
		lbl3.setImageFile("G:\\文件图片\\3.jpg");
		panel.add(lbl3, "3");

		lbl2 = new ViewImage();
		lbl2.setImageFile("G:\\文件图片\\2.jpg");
		panel.add(lbl2, "2");

		lbl1 = new ViewImage();
		lbl1.setImageFile("G:\\文件图片\\1.jpg");
		panel.add(lbl1, "1");

		btnFirst = new JButton("第一个");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFirst.setBounds(48, 209, 85, 36);
		contentPane.add(btnFirst);

		btnPrev = new JButton("上一个");
		btnPrev.setBounds(147, 209, 85, 36);
		contentPane.add(btnPrev);

		btnNext = new JButton("下一个");
		btnNext.setBounds(240, 209, 85, 36);
		contentPane.add(btnNext);

		btnLast = new JButton("最后个");
		btnLast.setBounds(339, 209, 85, 36);
		contentPane.add(btnLast);

		btnFirst.addActionListener(new BtnAction());
		btnLast.addActionListener(new BtnAction());
		btnNext.addActionListener(new BtnAction());
		btnPrev.addActionListener(new BtnAction());
	}

	/**
	 * 一个监听器搞定所有按钮 实现监听器的内部类
	 * 
	 * @author Jarvis
	 *
	 */
	private class BtnAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Object object = e.getSource();
			if (object == btnFirst) {
				cardLayout.first(panel);
			} else if (object == btnLast) {
				cardLayout.last(panel);
			} else if (object == btnNext) {
				cardLayout.next(panel);
			} else if (object == btnPrev) {
				cardLayout.previous(panel);
			}
		}

	}
}
