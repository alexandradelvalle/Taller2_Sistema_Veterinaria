public class Gato extends Animal implements Vacunable, Asegurable {

    // Atributo propio
    private boolean esEsterilizado;
    private int vacunasAplicadas;

    // Constructor

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    // Implementación del método abstracto costo de consulta
    @Override
    public double calcularCostoConsulta() {
        //$38.000 fijo, sin importar la edad
        return 38000;
    }

    // Vacunable
    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas++;
        System.out.println("Vacuna registrada para " + this.nombre + ": " + nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    // Asegurable
    @Override
    public double calcularPrimaSeguro() {
        //$120.000 fijo si está esterilizado, $200.000 si no
        if (esEsterilizado) {
            return 120000;
        }
        return 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre;
    }
}
