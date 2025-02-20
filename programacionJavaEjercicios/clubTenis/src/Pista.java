import java.util.Arrays;

public class Pista {
    public String[] tipo = {"tierra batida", "cemento"};
    public String[] superficie = {"principiante", "intermedio", "avanzado"};
    public double costo;

    public Pista(String[] tipo, String[] superficie, double costo) {
        this.tipo = tipo;
        this.superficie = superficie;
        this.costo = costo;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public String[] getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String[] superficie) {
        this.superficie = superficie;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Pista{" +
                "tipo=" + Arrays.toString(tipo) +
                ", superficie=" + Arrays.toString(superficie) +
                ", costo=" + costo +
                '}';
    }
}
