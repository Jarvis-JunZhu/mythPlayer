package mythPlayer.litter.exercise;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegisterUI extends JFrame {

	private JPanel				contentPane;
	private JTextField			textUserName;
	private JPasswordField		textPassword;
	private JTextField			textName;
	private JLabel				labelUserName;
	private JLabel				labelPassword;
	private JLabel				labelName;
	private JLabel				labelSex;
	private JLabel				labelFavorite;
	private JLabel				labelAcademic;
	private JLabel				labelHeader;
	private JLabel				labelElse;
	private JRadioButton		radioBoy;
	private JRadioButton		radioGirl;
	private JCheckBox			checkRead;
	private JCheckBox			checkGame;
	private JComboBox<String>	comboAcademy;
	private JButton				buttonChooseHeader;
	private JTextArea			textOther;
	private JButton				buttonSave;
	private JButton				buttonCancel;
	private ButtonGroup			buttonGroupSix;		// 创建一个radioButton的组
	private ViewImage			lblShowHeader;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Create the register window object
					RegisterUI frame = new RegisterUI();
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
	public RegisterUI() {
		setForeground(SystemColor.activeCaption);
		setTitle("欢迎用户注册");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(510, 436);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelUserName = new JLabel("用户名：");
		labelUserName.setBounds(59, 41, 72, 18);
		contentPane.add(labelUserName);

		textUserName = new JTextField();
		textUserName.setBounds(137, 38, 140, 24);
		contentPane.add(textUserName);
		textUserName.setColumns(10);

		labelPassword = new JLabel("密  码：");
		labelPassword.setBounds(59, 75, 72, 18);
		contentPane.add(labelPassword);

		textPassword = new JPasswordField();
		textPassword.setBounds(137, 72, 140, 24);
		contentPane.add(textPassword);

		labelName = new JLabel("姓  名：");
		labelName.setBounds(59, 109, 72, 18);
		contentPane.add(labelName);

		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(137, 106, 140, 24);
		contentPane.add(textName);

		labelSex = new JLabel("性  别：");
		labelSex.setBounds(59, 140, 72, 18);
		contentPane.add(labelSex);

		labelFavorite = new JLabel("爱  好：");
		labelFavorite.setBounds(59, 171, 72, 18);
		contentPane.add(labelFavorite);

		labelAcademic = new JLabel("学  历：");
		labelAcademic.setBounds(59, 202, 72, 18);
		contentPane.add(labelAcademic);

		labelHeader = new JLabel("头  像：");
		labelHeader.setBounds(59, 233, 72, 18);
		contentPane.add(labelHeader);

		labelElse = new JLabel("其  它：");
		labelElse.setBounds(59, 264, 72, 18);
		contentPane.add(labelElse);

		radioBoy = new JRadioButton("男");
		radioBoy.setBounds(137, 136, 55, 27);
		radioBoy.setActionCommand("男");
		radioBoy.setSelected(true);
		contentPane.add(radioBoy);

		radioGirl = new JRadioButton("女");
		radioGirl.setBounds(222, 136, 55, 27);
		radioBoy.setActionCommand("女");
		contentPane.add(radioGirl);

		// 放入男女单选按钮
		buttonGroupSix = new ButtonGroup();
		buttonGroupSix.add(radioBoy);
		buttonGroupSix.add(radioGirl);

		checkRead = new JCheckBox("阅读");
		checkRead.setBounds(144, 167, 64, 27);
		contentPane.add(checkRead);

		checkGame = new JCheckBox("游戏");
		checkGame.setBounds(213, 167, 64, 27);
		contentPane.add(checkGame);

		comboAcademy = new JComboBox<String>();
		comboAcademy.addItem("大专");
		comboAcademy.addItem("本科");
		comboAcademy.addItem("研究生");
		comboAcademy.addItem("博士");
		comboAcademy.setBounds(137, 199, 140, 24);
		contentPane.add(comboAcademy);

		buttonChooseHeader = new JButton("选择头像");
		buttonChooseHeader.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
				int choose = jFileChooser.showOpenDialog(null);
				// 判断点击的是否是打开的按钮
				if (choose == JFileChooser.APPROVE_OPTION) {
					// System.out.println("打开");
					// 获取被选中的文件
					File file = jFileChooser.getSelectedFile();
					// 显示获取选择文件的绝对路径
					// System.out.println(file.getAbsolutePath());
					// 显示图片
					// ImageIcon icon = new ImageIcon(file.getAbsolutePath());
					// lblShowHeader.setIcon(icon);
					lblShowHeader.setImageFile(file.getAbsolutePath());
				}
			}
		});
		buttonChooseHeader.setBounds(137, 229, 113, 27);
		contentPane.add(buttonChooseHeader);

		textOther = new JTextArea();
		textOther.setBounds(137, 262, 299, 76);
		contentPane.add(textOther);

		buttonSave = new JButton("保  存");
		buttonSave.setBounds(137, 351, 113, 27);
		contentPane.add(buttonSave);
		buttonSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// 获取JTextField的值（用户名）
				String userName = textUserName.getText();
				// 获取密码
				String password = new String(textPassword.getPassword());
				// 获取姓名
				String name = textName.getText();
				// 获取性别
				String sex = "男";
				if (radioGirl.isSelected()) {
					sex = radioGirl.getText();
				}
				// 获取性别的第二种方式
				// sex = buttonGroupSix.getSelection().getActionCommand();
				// JCheckBox
				// 判断是否选中，如果选中就获取值
				String likes = "";
				if (checkRead.isSelected()) {
					likes = likes + " " + checkRead.getText();
				}
				if (checkGame.isSelected()) {
					likes = likes + " " + checkGame.getText();
				}
				// JComboBox
				String eduGrade = comboAcademy.getSelectedItem().toString();
				// JtextArea
				String jString = textOther.getText();
				// 自己的头像
				String headerImg = lblShowHeader.getImageFile();

				System.out.println("userName:" + userName + "password:" + password + "name:" + name + "sex:" + sex
						+ "favorites:" + likes + "学历:" + eduGrade + "其它:" + jString + "头像:" + headerImg);

			}
		});

		buttonCancel = new JButton("退  出");
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonCancel.setBounds(275, 351, 113, 27);
		contentPane.add(buttonCancel);

		lblShowHeader = new ViewImage();
		lblShowHeader.setBounds(291, 41, 140, 91);
		lblShowHeader.setImageFile("C:\\Users\\Alan\\Desktop\\1KR93059-1.jpg");
		contentPane.add(lblShowHeader);
	}
}
