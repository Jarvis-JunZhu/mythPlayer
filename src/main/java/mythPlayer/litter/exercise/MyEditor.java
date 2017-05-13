package mythPlayer.litter.exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import mythPlayer.litter.util.OperateFile;

public class MyEditor extends JFrame {

	private JPanel		contentPane;
	private JTextArea	txtContent;
	private JMenuBar	menuBar;
	private JMenu		mnFile;
	private JMenu		mnEdit;
	private JMenu		mnHelp;
	private JMenuItem	mntmNewFile;
	private JMenuItem	mntmOpenFile;
	private JMenuItem	mntmSave;
	private JMenuItem	mntmExit;
	private JMenuItem	mntmAbout;
	private JScrollPane	scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyEditor frame = new MyEditor();
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
	public MyEditor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(580, 626);
		setLocationRelativeTo(null);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmNewFile = new JMenuItem("New File");
		mnFile.add(mntmNewFile);

		mntmOpenFile = new JMenuItem("Open File");
		mnFile.add(mntmOpenFile);

		mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);

		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);

		mntmExit = new JMenuItem("Exit");
		mnHelp.add(mntmExit);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		txtContent = new JTextArea();
		scrollPane.setViewportView(txtContent);

		MenuItemActionListener menuItemActionListener = new MenuItemActionListener();
		mntmAbout.addActionListener(menuItemActionListener);
		mntmExit.addActionListener(menuItemActionListener);
		mntmNewFile.addActionListener(menuItemActionListener);
		mntmOpenFile.addActionListener(menuItemActionListener);
		mntmSave.addActionListener(menuItemActionListener);
	}

	private class MenuItemActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == mntmExit) {
				System.exit(-1);
			} else if (source == mntmOpenFile) {
				// System.out.println("open");
				// 0、选择文件
				// 1、读文件
				// 2、将文件内容显示在JTextArea TXTContent里面
				JFileChooser fileChooser = new JFileChooser();
				int result = fileChooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectFile = fileChooser.getSelectedFile();
					String fileName = selectFile.getAbsolutePath();
					System.out.println(fileName);
					String content = OperateFile.readFile(fileName);
					System.out.println(content);
					txtContent.setText(content);
				}
			}
		}

	}

}
