public class Main {
    public static void main(String[] args) {
        SistemaEstudiantes sistema = new SistemaEstudiantes();
        
        sistema.agregarEstudiante("Ana", 15, 16.5);
        sistema.agregarEstudiante("Carlos", 14, 13.0);
        sistema.agregarEstudiante("Maria", 16, 18.0);
        
        sistema.mostrarEstudiantes();
        sistema.mostrarAprobados();
    }
}

class Estudiante {
    private String nombre;
    private int edad;
    private double nota;
    
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    
    public boolean estaAprobado() {
        return nota >= 11;
    }
    
    public void mostrarInfo() {
        System.out.println(nombre + " - " + edad + " años - Nota: " + nota);
    }
    
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNota() { return nota; }
}

class SistemaEstudiantes {
    private Estudiante[] estudiantes = new Estudiante[10];
    private int cantidad = 0;
    
    public void agregarEstudiante(String nombre, int edad, double nota) {
        if (cantidad < estudiantes.length) {
            estudiantes[cantidad] = new Estudiante(nombre, edad, nota);
            cantidad++;
        }
    }
    
    public void mostrarEstudiantes() {
        for (int i = 0; i < cantidad; i++) {
            estudiantes[i].mostrarInfo();
        }
    }
    
    public void mostrarAprobados() {
        System.out.println("Estudiantes aprobados:");
        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].estaAprobado()) {
                estudiantes[i].mostrarInfo();
            }
        }
    }
}