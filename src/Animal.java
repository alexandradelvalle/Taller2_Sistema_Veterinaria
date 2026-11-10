public abstract class Animal {

    // A. Atributos comunes
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    // B. Método que todas deben resolver. Método abstract
    public abstract double calcularCostoConsulta();

    // C. Método que todas heredan igual. Ficha que muestra siempre los mismos datos
    public void imprimirFicha() {
        System.out.println("--- FICHA VETERINARIA ---");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
    }
}
