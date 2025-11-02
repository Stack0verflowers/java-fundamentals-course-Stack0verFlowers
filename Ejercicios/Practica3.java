public class Main {
    public static void main(String[] args) {
        double nota = 14.5;
        
        System.out.println("Nota: " + nota);
        
        if (nota >= 18) {
            System.out.println("Excelente");
        } else if (nota >= 15) {
            System.out.println("Muy bien");
        } else if (nota >= 11) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }
}