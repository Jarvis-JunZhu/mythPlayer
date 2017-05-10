package mythPlayer.litter.exercise;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author Jarvis
 */
public class TFFrame extends JFrame {

	/**
	 * 自动生成序列号
	 */
	private static final long serialVersionUID = -3685851383339261303L;

	// 在构造方法里面初始化
	public TFFrame() {
		TextField textField = new TextField();
		add(textField);

		// 给textField注册监听器，匿名内部类实现监听接口
		textField.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				TextField textField = (TextField) e.getSource();
				System.out.println(textField.getText());
			}
		});
		pack();
		setSize(800, 600);// 设置输入框宽和高
		setLocation(500, 250);// 设置输入框的位置
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭按钮退出程序
		setTitle("我的第一个文本输入框");
		setVisible(true);
	}

	// 利用主方法进行测试
	public static void main(String[] args) {
		new TFFrame();
	}

}
