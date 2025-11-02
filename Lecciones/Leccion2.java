public class Home {
    public static void main(String[] args) {
        System.out.println("CURSO JAVA - LECCION 2: VARIABLES");
        System.out.println("==================================");
        
        leccion2();
    }
    
    public static void leccion2() {
        System.out.println("\nLECCION 2: VARIABLES Y TIPOS DE DATOS");
        System.out.println("--------------------------------------");
        
        // EJEMPLOS DEMOSTRATIVOS
        String nombreEjemplo = "Carlos";
        int edadEjemplo = 16;
        double alturaEjemplo = 1.70;
        boolean esEstudianteEjemplo = true;
        
        System.out.println("--- EJEMPLO ---");
        System.out.println("Nombre: " + nombreEjemplo);
        System.out.println("Edad: " + edadEjemplo);
        System.out.println("Altura: " + alturaEjemplo + " m");
        System.out.println("Es estudiante: " + esEstudianteEjemplo);
        
        System.out.println("\n--- TU TURNO ---");
        System.out.println("Modifica estos valores con tus datos:");
        
        String miNombre = "__________";
        int miEdad = 0;
        double miAltura = 0.0;
        boolean soyEstudiante = true;
        
        System.out.println("Mi nombre: " + miNombre);
        System.out.println("Mi edad: " + miEdad);
        System.out.println("Mi altura: " + miAltura + " m");
        System.out.println("Soy estudiante: " + soyEstudiante);
        
        System.out.println("\n--- OPERACIONES CON VARIABLES ---");
        int añoNacimiento = 2025 - miEdad;
        System.out.println("Probablemente naciste alrededor del año: " + añoNacimiento);
        
        System.out.println("\nLECCION 2 COMPLETADA");
    }
}