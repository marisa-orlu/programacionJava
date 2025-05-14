package Clase1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	private JButton boton1;
	private JButton boton2;
	private JLabel etiqueta;
	private JLabel etiqueta1;
	private JTextField cuadroDeTexto;

	private JComboBox combo;

	private JTextArea areaTexto;
	String array[];

	ActionListener accion;

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

		// Cuadro de texto
		cuadroDeTexto = new JTextField();

		cuadroDeTexto.setBounds(10, 110, 150, 90);
		cuadroDeTexto.setText("Cuadro");
		String dato;
		dato = cuadroDeTexto.getText();
		this.add(cuadroDeTexto);
		System.out.println("Este es el contenido " + dato);

		array = new String[3];

		array[0] = "uno";
		array[1] = "dos";
		array[2] = "tres";

		combo = new JComboBox(array);
		combo.setBounds(10, 220, 150, 90);
		combo.addItem(dato);
		this.add(combo);

		areaTexto = new JTextArea();
		areaTexto.setBounds(10, 310, 150, 150);
		areaTexto.setText("Este es");
		areaTexto.append("\n el contenido del cuadro");
		this.add(areaTexto);

		accion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				combo.addItem("Otra linea");
				areaTexto.append("\n nueva linea");

				int x = areaTexto.getX();
				int y = areaTexto.getY();
				x++;
				y++;
				areaTexto.setLocation(x, y);

			}

		};

		boton1.addActionListener(accion);

	}

}
