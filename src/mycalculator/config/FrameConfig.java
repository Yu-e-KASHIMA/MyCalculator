package mycalculator.config;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameConfig extends JFrame {

	public FrameConfig(){

		setTitle("My Calculator");

		ImageIcon icon = new ImageIcon("./img/icon_105830_128.png");
		setIconImage(icon.getImage());

		int appWidth = 300;
		int appHeight = 400;
		setSize(appWidth, appHeight);
		setLocationRelativeTo(null);
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
