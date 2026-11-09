public class Gato extends Animal {

    // Atributo propio
    private boolean esEsterilizado;

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
}
