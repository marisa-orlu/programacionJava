public class Socios {
    public String nobre_socio;
    public int edad;
    public int antiguedad;
    public double cuota;

    public Socios(String nobre_socio, int edad, int antiguedad, double cuota) {
        this.nobre_socio = nobre_socio;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.cuota = cuota;
    }

    public String getNobre_socio() {
        return nobre_socio;
    }

    public void setNobre_socio(String nobre_socio) {
        this.nobre_socio = nobre_socio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Socios{" +
                "nobre_socio='" + nobre_socio + '\'' +
                ", edad=" + edad +
                ", antiguedad=" + antiguedad +
                ", cuota=" + cuota +
                '}';
    }

    public static double calcularCuota(int antiguedad,double cuota_base ){
        cuota_base= 70.5;
        double descuento_mayor= 15;
        double descuento_menor = 5;
        double couta_final=0;

        if(antiguedad>20){
             couta_final= cuota_base - (cuota_base*descuento_mayor)/100;
        } else if (antiguedad<20 && antiguedad>10) {
            couta_final= cuota_base - (cuota_base*descuento_menor)/100;
        }
        return couta_final;
    }
}
