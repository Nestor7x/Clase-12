public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(double precioBase, int anio, String marca, String modelo, String placa) {
        this.precioBase = precioBase;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "anio=" + anio +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }

}
