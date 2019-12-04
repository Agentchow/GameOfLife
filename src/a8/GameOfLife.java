package a8;

import java.awt.*;

import javax.swing.*;

public class GameOfLife {

	public static void main(String[] args) {
		
		View view = new View();
		view.isStandalone = true;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Conway's Game of Life");
		frame.getContentPane().add(view, BorderLayout.CENTER);
		view.init();
		view.start();
		frame.setSize(850, 700);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}
}