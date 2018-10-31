package mycalculator.main;

import java.awt.EventQueue;

import mycalculator.config.ContentLayout;
import mycalculator.config.FrameConfig;

public class Play {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			FrameConfig frame = new FrameConfig();
			ContentLayout contents = new ContentLayout();
			frame.setContentPane(contents);
			frame.setVisible(true);
		});
	}
}