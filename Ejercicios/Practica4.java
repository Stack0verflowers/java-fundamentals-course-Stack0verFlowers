public class Main {
    public static void main(String[] args) {
        double resultado1 = calcularAreaCirculo(5.0);
        double resultado2 = calcularPromedio(14, 16, 15);
        
        System.out.println("Area del circulo: " + resultado1);
        System.out.println("Promedio: " + resultado2);
    }
    
    public static double calcularAreaCirculo(double radio) {
        return 3.1416 * radio * radio;
    }
    
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}