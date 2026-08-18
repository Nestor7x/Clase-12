public class CamionCarga extends Vehiculo {

    double capacidadToneladas;

    public CamionCarga() {
    }


    public CamionCarga(String modelo, String placa, double precioBase, String marca, int anio, double capacidadToneladas) {
        super(modelo, placa, precioBase, marca, anio);
        setCapacidadToneladas(capacidadToneladas);
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        if (capacidadToneladas > 0) {
            this.capacidadToneladas = capacidadToneladas;
        } else {
            System.out.println("La capacidad en toneladas debe ser mayor a 0");
        }
    }

    @Override
    public String toString() {
        return "CamionCarga{" +
                "capacidadToneladas=" + capacidadToneladas +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double impuesto = getPrecioBase() * 0.05;
        double recargo = capacidadToneladas * 500000;

        return getPrecioBase() + impuesto + recargo;
    }
}
