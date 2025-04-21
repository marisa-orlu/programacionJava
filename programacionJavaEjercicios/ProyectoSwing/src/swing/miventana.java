package swing;

import java.awt.Color;

import javax.swing.JFrame;

public class miventana extends JFrame {

	public miventana() {
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Er bertih hueno");
		this.getContentPane().setBackground(Color.green);
	}
}
