abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String placa, double precioBase, String marca, int anio) {
        if (!modelo.trim().isEmpty()){
            this.modelo = modelo;
        } else {
            System.out.println("El modelo no puede estar vacio");
        }
        if (!placa.trim().isEmpty()){
            this.placa = placa;
        } else {
            System.out.println("La placa no puede estar vacia");
        }
        if (precioBase>0){
            this.precioBase = precioBase;
        } else {
            System.out.println("El precio base debe ser mayor a cero");
        }
        if (!marca.trim().isEmpty()){
            this.marca = marca;
        } else {
            System.out.println("La marca no puede estar vacia");
        }
        if (anio>=1990 && anio<=2026){
            this.anio = anio;
        }else {
            System.out.println("El año debe estar entre 1990 y el año actual");
        }
    }

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setAnio(int anio) {
        if (anio>=1990 && anio<=2026){
            this.anio = anio;
        }else {
            System.out.println("El año debe estar entre 1990 y el año actual");
        }
    }

    public void setMarca(String marca) {
        if (!marca.trim().isEmpty()){
            this.marca = marca;
        } else {
            System.out.println("La marca no puede estar vacia");
        }
    }

    public void setModelo(String modelo) {
        if (!modelo.trim().isEmpty()){
            this.modelo = modelo;
        } else {
            System.out.println("El modelo no puede estar vacio");
        }
    }

    public void setPlaca(String placa) {
        if (!placa.trim().isEmpty()){
            this.placa = placa;
        } else {
            System.out.println("La placa no puede estar vacia");
        }
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase>0){
            this.precioBase = precioBase;
        } else {
            System.out.println("El precio base debe ser mayor a cero");
        }
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

    public abstract double calcularPrecioFinal();

    public String mostrarFicha(){
        return ("Placa: "+placa+
                "Marca: "+marca+
                "Modelo: "+modelo+
                "Año: "+anio+
                "Precio base: "+precioBase);
    }
}
