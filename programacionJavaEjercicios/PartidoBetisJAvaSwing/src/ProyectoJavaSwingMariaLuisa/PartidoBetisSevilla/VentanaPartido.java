package PartidoBetisSevilla;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPartido extends JFrame {
	// estos son los botones para el betis y para el sevilla
	private JButton botonBetis;
	private JButton botonSevilla;
	private JLabel marcador;
	private JLabel resultadoFinal;
	// estos son las variables que voy a utilizar para guardar los goles de cada
	// equipo
	private int golesBetis = 0;
	private int golesSevilla = 0;

	public VentanaPartido() {
		this.setBounds(90, 40, 700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Betis vs Sevilla");
		this.getContentPane().setBackground(Color.white);
		this.setLayout(null);

		marcador = new JLabel("Betis 0 - 0 Sevilla", JLabel.CENTER);
		marcador.setBounds(150, 10, 400, 60);
		marcador.setFont(new Font("Arial", Font.BOLD, 30));
		marcador.setForeground(Color.black);
		this.add(marcador);

		botonBetis = new JButton("¡Gol Betis!");
		botonBetis.setBounds(50, 100, 250, 80);
		botonBetis.setBackground(Color.green);
		botonBetis.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(botonBetis);

		botonSevilla = new JButton("¡Gol Sevilla!");
		botonSevilla.setBounds(380, 100, 250, 80);
		botonSevilla.setBackground(Color.red);
		botonSevilla.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(botonSevilla);

		resultadoFinal = new JLabel("", JLabel.CENTER); // esto es para centrar el resultado en el centro
		resultadoFinal.setBounds(100, 200, 500, 100);
		resultadoFinal.setFont(new Font("Arial", Font.BOLD, 22));
		resultadoFinal.setText("¡Empieza El Gran Derbi!!!!");

		this.add(resultadoFinal);

		botonBetis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (golesBetis < 3 && golesSevilla < 3) { // Solo se suma un gol si los dos tienen menos de 3 goles
					golesBetis++;
					actualizarMarcador();
				}
			}
		});

		botonSevilla.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (golesSevilla < 3 && golesBetis < 3) {
					golesSevilla++;
					actualizarMarcador();
				}
			}
		});
	}

	private void actualizarMarcador() {
		marcador.setText("Betis " + golesBetis + " - " + golesSevilla + " Sevilla");

		if (golesBetis == 2 && golesSevilla < 3) {
			resultadoFinal.setText("¡El Betis está cerca de ganar!");
		} else if (golesSevilla == 2 && golesBetis < 3) {
			resultadoFinal.setText("¡El Sevilla está cerca de ganar!");
		}
		if (golesBetis == 2 && golesSevilla == 2) {
			resultadoFinal.setText("Falta un gol para ganar!!!");
		}

		if (golesBetis == 3) {
			resultadoFinal.setText("<html>Ole Olee er BETIII<br><br>MUSHO BETI MUSHO BETI EH EH</html>");
			botonBetis.setEnabled(false);
			botonSevilla.setEnabled(false);
		} else if (golesSevilla == 3) {
			resultadoFinal
					.setText("<html>Vaya... han ganado los sevillistas :(<br><br>VIVA ER BETI MANQUEPIERDA</html>");
			botonBetis.setEnabled(false);
			botonSevilla.setEnabled(false);
		}
	}
}
