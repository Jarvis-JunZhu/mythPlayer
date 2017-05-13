package mythPlayer.litter.exercise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUI extends JFrame {

	private JLabel			labelUsername, labelPassword;	// label对象
	private JTextField		textUsername;					// 输入框对象
	private JPasswordField	jPasswordField;					// 密码输入对象
	private JButton			jButton;						// 登陆按钮

	public LoginUI() {
		init();
	}

	/**
	 * 初始化方法
	 */
	private void init() {
		// 设置窗口大小
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口居中
		this.setLocationRelativeTo(null);
		// Container container = this.getContentPane();

		labelUsername = new JLabel();
		labelUsername.setText("用户名");
		labelUsername.setBounds(50, 20, 50, 20);

		labelPassword = new JLabel();
		labelPassword.setText("密码");
		labelPassword.setBounds(50, 45, 50, 20);

		textUsername = new JTextField();
		textUsername.setBounds(100, 20, 150, 20);

		jPasswordField = new JPasswordField();
		jPasswordField.setBounds(100, 45, 150, 20);

		jButton = new JButton();
		jButton.setText("登  录");
		jButton.setBounds(125, 70, 100, 20);

		this.setLayout(null);
		this.add(labelUsername);
		this.add(labelPassword);
		this.add(textUsername);
		this.add(jPasswordField);
		this.add(jButton);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		LoginUI jFrame = new LoginUI();
		jFrame.setTitle("欢迎登陆");
		jFrame.setResizable(false);// 设置不可变大小
		// jFrame.setIconImage();

	}

}
