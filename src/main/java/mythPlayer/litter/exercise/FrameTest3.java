package mythPlayer.litter.exercise;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("GridBagLayout");
		jFrame.setLayout(new GridBagLayout());
		JButton jButton = new JButton("Button1");
		GridBagConstraints gbc = new GridBagConstraints();
		// 设定第一个单元格的属性值
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;// 组件宽
		gbc.gridheight = 1;// 组件高
		gbc.weightx = 0;// 行的权重，通过这个属性来决定如何分配行的剩余空间
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		// 当组件在格内而不能撑满其格时，通过fill的值来设定填充方式，有四个值
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.ipadx = 0;// 组件间的横间距
		gbc.ipady = 0;// 组件间的纵向间距
		jFrame.add(jButton, gbc);
		// 设定第二个单元格属性值
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weightx = 1;
		gbc.weighty = 0;
		// 当组件小于其显示区域时，用于确定将组件置于何处（在显示区域中）
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5); // 设置组件之间彼此的间距
		gbc.ipadx = 0;
		gbc.ipady = 0;
		JButton btn = new JButton("Button2");
		jFrame.add(btn, gbc);

		// 设定第三个单元格属性值
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = GridBagConstraints.REMAINDER;
		gbc.weightx = 0;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.ipadx = 10;
		gbc.ipady = 10;
		JButton btn1 = new JButton("Button3");
		jFrame.add(btn1, gbc);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
