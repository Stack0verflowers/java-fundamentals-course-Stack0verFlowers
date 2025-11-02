public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1500.00, 10);
        Producto p2 = new Producto("Mouse", 25.50, 50);
        
        p1.mostrarInfo();
        p2.mostrarInfo();
        
        System.out.println("Valor total del stock: " + p1.calcularValorTotal());
    }
}

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
    
    public double calcularValorTotal() {
        return precio * cantidad;
    }
}