public class Automovil extends Vehiculo{

int numeroPuertas;
String tipoConbustible;

    public Automovil() {
    }

    public Automovil(String modelo, String placa, double precioBase, String marca, int anio, int numeroPuertas, String tipoConbustible) {
        super(modelo, placa, precioBase, marca, anio);
        setNumeroPuertas(numeroPuertas);
        setTipoConbustible(tipoConbustible);
        this.tipoConbustible = tipoConbustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getTipoConbustible() {
        return tipoConbustible;
    }


    public void setNumeroPuertas(int numeroPuertas) {
      if (numeroPuertas>=2 && numeroPuertas<=5){
          this.numeroPuertas = numeroPuertas;
      }else {
          System.out.println("El numero de puertas ddebe estar entre 2 y 5");
      }
    }

    public void setTipoConbustible(String tipoConbustible) {
        if (tipoConbustible != null && (tipoConbustible.equalsIgnoreCase("Gasolina") ||
                tipoConbustible.equalsIgnoreCase("Diésel") || tipoConbustible.equalsIgnoreCase("Eléctrico"))) {
            this.tipoConbustible = tipoConbustible;
        }else {
            System.out.println("El tipo de combustible debe ser Gasolina, Diésel o Eléctrico");
        }
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", tipoConbustible='" + tipoConbustible + '\'' +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double impuesto;
        if (this.tipoConbustible!=null && this.tipoConbustible.equalsIgnoreCase("Eléctrico")){
            impuesto = 0.04;
        }else {
            impuesto= 0.08;
        }
        return getPrecioBase() + getPrecioBase() * impuesto;
    }


}
