public class Home {
    public static void main(String[] args) {
        System.out.println("CURSO JAVA - LECCION 5: POO COMPLETA");
        System.out.println("=====================================");
        
        leccion5();
    }
    
    public static void leccion5() {
        System.out.println("\nLECCION 5: PROGRAMACION ORIENTADA A OBJETOS COMPLETA");
        System.out.println("-----------------------------------------------------");
        
        System.out.println("\nPARTE 1: CONSTRUCTORES");
        System.out.println("----------------------");
        
        // Usando constructores
        Estudiante est1 = new Estudiante("Maria", 15, 16.5);
        Estudiante est2 = new Estudiante("Carlos", 14, 13.0);
        
        est1.mostrarInfo();
        est2.mostrarInfo();
        
        System.out.println("\nPARTE 2: ENCAPSULACION - GETTERS Y SETTERS");
        System.out.println("------------------------------------------");
        
        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", 300);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        
        // Usando getters y setters
        libro1.setPaginas(350);
        System.out.println("Paginas actualizadas: " + libro1.getPaginas());
        
        System.out.println("\nPARTE 3: PROYECTO FINAL - SISTEMA DE BIBLIOTECA");
        System.out.println("-----------------------------------------------");
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(new Libro("Java para Principiantes", "Ana Garcia", 200));
        
        System.out.println("\nLIBROS EN LA BIBLIOTECA:");
        biblioteca.mostrarLibros();
        
        System.out.println("\nBUSCAR LIBRO:");
        biblioteca.buscarLibro("Harry Potter");
        biblioteca.buscarLibro("Don Quijote");
        
        System.out.println("\nEJERCICIO: CREA TU PROPIO LIBRO");
        System.out.println("Modifica los valores abajo:");
        
        Libro miLibro = new Libro("MI LIBRO", "MI AUTOR", 150);
        miLibro.mostrarInfo();
        
        System.out.println("\nLECCION 5 COMPLETADA");
    }
}

// CLASE ESTUDIANTE CON CONSTRUCTOR
class Estudiante {
    String nombre;
    int edad;
    double nota;
    
    // Constructor
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Nota: " + nota);
        if (nota >= 11) {
            System.out.println("  Estado: Aprobado");
        } else {
            System.out.println("  Estado: Desaprobado");
        }
    }
}

// CLASE LIBRO CON ENCAPSULACION
class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    
    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public void setPaginas(int paginas) {
        if (paginas > 0) {
            this.paginas = paginas;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " - Paginas: " + paginas);
    }
}

// CLASE BIBLIOTECA PARA EL PROYECTO FINAL
class Biblioteca {
    private Libro[] libros = new Libro[10];
    private int cantidadLibros = 0;
    
    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
            System.out.println("Libro agregado: " + libro.getTitulo());
        }
    }
    
    public void mostrarLibros() {
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.print((i + 1) + ". ");
            libros[i].mostrarInfo();
        }
    }
    
    public void buscarLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: ");
                libros[i].mostrarInfo();
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }
}