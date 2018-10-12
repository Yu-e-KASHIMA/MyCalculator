package mycalculator;

import java.awt.EventQueue;

import mycalculator.config.ContentLayout;
import mycalculator.config.FrameConfig;

public class Play{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				FrameConfig frame = new FrameConfig();
				ContentLayout contents = new ContentLayout();
				frame.setContentPane(contents);
				frame.setVisible(true);
				}
			});
	}

}