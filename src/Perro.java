public class Perro extends Animal implements Vacunable, Asegurable {

    // Atributo propio
    private String raza;
    private int vacunasAplicadas;

    // Constructor
    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno); // Envía los 3 datos al constructor del padre (Animal)
        this.raza = raza;                 // Guarda el dato propio de Perro
    }

    // Implementación del método abstracto costo de consulta
    @Override
    public double calcularCostoConsulta() {
        // $45.000 base + $3.000 por cada año de edad
        return 45000 + (3000 * edad);
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
        //$80.000 anuales por cada año de edad
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre;
    }
}
