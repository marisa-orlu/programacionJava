package practicaClase;

public class HoraExacta extends Hora {

	protected int segundos;

	HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);

		this.segundos = segundos;

		if (!setSegudos(segundos)) {
			System.out.println("Segundos incorrectos");
		}
	}

	public boolean setSegudos(int segundos) {
		boolean correcto = false;

		if (0 <= segundos && segundos > 60) {
			this.segundos = segundos;
			correcto = true;
		}
		return correcto;
	}

	@Override
	public void inc() {
		segundos++;
		if (segundos > 59) {
			segundos = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		return super.toString() + ":" + segundos;
	}

	@Override
	public boolean equals(Object o) {
		boolean iguales;

		HoraExacta otroReloj = (HoraExacta) o;// Se esta casteando o que es objetc a horaExacta

		if (this.hora == otroReloj.hora && this.minutos == otroReloj.minutos) {
			iguales = true;
		} else {
			iguales = false;
		}

		return iguales;
	}

}
