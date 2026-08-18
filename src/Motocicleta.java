public class Motocicleta extends Vehiculo {

    int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String modelo, String placa, double precioBase, String marca, int anio, int cilindraje) {
        super(modelo, placa, precioBase, marca, anio);
        setCilindraje(cilindraje);
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if (cilindraje > 0) {
            this.cilindraje = cilindraje;
        } else {
            System.out.println("El cilindraje debe ser mayor a 0");
        }
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double impuesto = 0.03;
        double recargo = 0;

        if (this.cilindraje > 500) {
            recargo = 0.02;
        }

        return getPrecioBase() + (getPrecioBase() * impuesto) +
                (getPrecioBase() * recargo);
    }
}



