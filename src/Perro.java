public class Perro extends Animal {

    // Atributo propio
    private String raza;

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

}
