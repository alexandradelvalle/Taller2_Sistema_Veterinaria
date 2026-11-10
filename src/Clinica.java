public class Clinica implements Asegurable {

    // Dos atributos
    private String nombre;
    private String direccion;

    // Constructor
    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Métodos Asegurable
    @Override
    public double calcularPrimaSeguro() {
        //$5.000.000 fijos por año
        return 5_000_000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        //número de póliza puede tener el formato POL-CLINICA-[NOMBRE]
        return "POL-CLINICA-" + nombre;
    }

}

