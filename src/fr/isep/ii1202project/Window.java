package fr.isep.ii1202project;

import javax.swing.*;
import java.awt.*;

public class Window {

	public Window(int whidth, int height, String title, Game game) {

		JFrame frame = new JFrame(title);
		frame.setPreferredSize(new Dimension(whidth, height));
		frame.setMaximumSize(new Dimension(whidth, height));
		frame.setMinimumSize(new Dimension(whidth, height));

		frame.add(game);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);



	}
}
