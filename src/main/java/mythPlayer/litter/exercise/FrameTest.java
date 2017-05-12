package mythPlayer.litter.exercise;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {

	public static void main(String[] args) {
		// 创建一个框架
		Frame frame = new Frame("Test");
		frame.setSize(800, 600);
		frame.setLocation(500, 250);
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);

		// JFrame设置关闭的方式与Frame设置关闭的方式不同
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		// frame.setLayout(new FlowLayout());// 设置浮动布局方式
		frame.setLayout(new GridLayout(3, 1, 100, 10));

		Button button1 = new Button("Button1");
		Button button2 = new Button("Button2");
		Button button3 = new Button("Button3");
		Button button4 = new Button("Button4");
		Button button5 = new Button("Button5");

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);

	}
}
