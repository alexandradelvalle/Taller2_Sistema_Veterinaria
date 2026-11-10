public class Main {
    public static void main(String[] args) {

        // Instancias
        Perro perro = new Perro("Toby", 4, "Alexander", "Pitbull");
        Gato gato = new Gato("Garfield", 2, "Lupita", true);
        Ave ave = new Ave("Río", 1, "Jorge", 150);

        // Arreglo
        Animal[] animales = { perro, gato, ave, new Conejo("Tambor", 2, "Layla") };

        // Recorrer arreglo con ciclo for y llamar imprimirFicha()
        for (int i = 0; i < animales.length; i++) {
            animales[i].imprimirFicha();
        }

        // Vacunar los que aplican (perro y gato)
        System.out.println("\n--- REGISTRO DE VACUNACIÓN ---");
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Moquillo");

        gato.registrarVacuna("Leucemia felina");

        System.out.println("Total vacunas aplicadas a " + perro.nombre + ": " + perro.getVacunasAplicadas());
        System.out.println("Total vacunas aplicadas a " + gato.nombre + ": " + gato.getVacunasAplicadas());

        // Calcular las pólizas
        System.out.println("\n--- PÓLIZAS DE SEGURO ---");
        Clinica clinica = new Clinica("VetCare", "Calle 45 # 12-30");

        Asegurable[] asegurables = { perro, gato, clinica };

        for (int i = 0; i < asegurables.length; i++) {
            System.out.println("Póliza: " + asegurables[i].obtenerNumeroPoliza()
                    + " · Prima anual: $" + asegurables[i].calcularPrimaSeguro());
        }

    }
}

