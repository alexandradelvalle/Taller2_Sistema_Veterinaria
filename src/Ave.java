public class Ave extends Animal {

    // Atributo propio
    private double pesoGramos;

    // Constructor
    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    // Implementación del método abstracto costo de consulta
    @Override
    public double calcularCostoConsulta() {
        //$28.000 base + $100 por cada gramo de peso
        return 28000 + (100 * pesoGramos);
    }
}

