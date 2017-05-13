package mythPlayer.litter.exercise;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ViewImage extends JLabel {
	private static final long	serialVersionUID	= 431906786824146055L;
	private String				imageFile;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (imageFile != null && !"".equals(imageFile)) {
			try {
				// 获取图片文件对应的Image对象
				ImageIcon icon = new ImageIcon(this.imageFile);
				Image img = icon.getImage();
				// 画图片
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
		this.repaint();// 重画
	}

}
