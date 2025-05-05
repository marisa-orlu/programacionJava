package Clase1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {
	private JButton boton1;
	private JButton boton2;
	private JLabel etiqueta;
	private JLabel etiqueta1;

	public Ventana() {
		this.setBounds(90, 40, 700, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Cabecera");
		this.getContentPane().setBackground(Color.green);

		this.setLayout(null); // Si se pone null le estas diciendo que tu eres quien modifica el tamaño

		// Botones
		boton1 = new JButton("Botón 1");
		boton1.setBounds(10, 10, 150, 90);
		this.add(boton1);

		boton2 = new JButton("Botón 2");
		boton2.setBounds(160, 10, 150, 90);
		this.add(boton2);

		// Etiquetas
		etiqueta = new JLabel("Nombre: ");
		etiqueta.setBounds(310, 10, 150, 90);
		etiqueta.setText("Nuevo nombre: ");
		etiqueta.setForeground(Color.red);
		etiqueta.setOpaque(true);
		etiqueta.setBackground(Color.cyan);
		etiqueta.setFont(new Font("arial", Font.BOLD, 30));
		this.add(etiqueta);

		etiqueta1 = new JLabel("Apellido: ");
		etiqueta1.setBounds(460, 10, 150, 90);
		this.add(etiqueta1);
	}

}
