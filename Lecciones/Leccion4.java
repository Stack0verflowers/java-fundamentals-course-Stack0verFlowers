public class Home {
    public static void main(String[] args) {
        System.out.println("CURSO JAVA - LECCIÓN 4: MÉTODOS Y POO");
        System.out.println("=========================================");
        
        leccion4();
    }
    
    public static void leccion4() {
        System.out.println("\n LECCIÓN 4: MÉTODOS E INTRODUCCIÓN A POO");
        System.out.println("------------------------------------------");
        
        System.out.println(" PARTE 1: MÉTODOS SIMPLES");
        System.out.println("---------------------------");
        
        // Llamar métodos
        saludar();
        mostrarMensaje("¡Aprendiendo métodos!");
        calcularEdadFutura(15);
        
        System.out.println("\n MÉTODOS CON RETORNO:");
        int suma = sumar(8, 5);
        System.out.println("8 + 5 = " + suma);
        
        String saludo = crearSaludo("Ana", 14);
        System.out.println(saludo);
        
        System.out.println("\n PARTE 2: PROGRAMACIÓN ORIENTADA A OBJETOS");
        System.out.println("-------------------------------------------");
        
        System.out.println(" CREANDO OBJETOS ESTUDIANTE:");
        
        // Crear objetos Estudiante
        Estudiante est1 = new Estudiante();
        est1.nombre = "María";
        est1.edad = 15;
        est1.nota = 16.5;
        
        Estudiante est2 = new Estudiante();
        est2.nombre = "Carlos";
        est2.edad = 14;
        est2.nota = 13.0;
        
        // Usar métodos de los objetos
        est1.mostrarInfo();
        est2.mostrarInfo();
        
        System.out.println("\n VERIFICANDO APROBACIÓN:");
        est1.verificarAprobacion();
        est2.verificarAprobacion();
        
        System.out.println("\n ¡CREA TU PROPIO ESTUDIANTE!");
        System.out.println("Modifica los valores abajo:");
        
        Estudiante yo = new Estudiante();
        yo.nombre = "TU_NOMBRE";      //  Cambia por tu nombre
        yo.edad = 0;                  //  Cambia por tu edad
        yo.nota = 15.0;               //  Cambia por tu nota
        
        System.out.println("\n MI INFORMACIÓN:");
        yo.mostrarInfo();
        yo.verificarAprobacion();
        
        System.out.println("\n ¡LECCIÓN 4 COMPLETADA!");
    }
    
    // MÉTODOS
    public static void saludar() {
        System.out.println(" ¡Hola desde el método saludar!");
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(" Mensaje: " + mensaje);
    }
    
    public static void calcularEdadFutura(int edadActual) {
        int edad2030 = edadActual + 5;
        System.out.println(" En 2030 tendrás " + edad2030 + " años");
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static String crearSaludo(String nombre, int edad) {
        return "Hola " + nombre + ", tienes " + edad + " años";
    }
}

// CLASE ESTUDIANTE
class Estudiante {
    String nombre;
    int edad;
    double nota;
    
    public void mostrarInfo() {
        System.out.println(" " + nombre + " - " + edad + " años - Nota: " + nota);
    }
    
    public void verificarAprobacion() {
        if (nota >= 11) {
            System.out.println("   " + nombre + " está APROBADO");
        } else {
            System.out.println("   " + nombre + " está DESAPROBADO");
        }
    }
}