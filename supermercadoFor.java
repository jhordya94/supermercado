
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class supermercadoFor {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para tomar la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Creamos un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generamos un número aleatorio de productos entre 1 y 23
        int numProductos = random.nextInt(23) + 1;
        System.out.println("Se generaron " + numProductos + " productos");

        // Inicializamos la variable para almacenar el total
        double total = 0;
        
        // Utilizamos un ciclo for para ingresar la información de cada producto
        for (int i = 0; i < numProductos; i++) {
            System.out.println("Ingresa el nombre del producto " + (i + 1));
            String nombreProducto = sc.nextLine();

            System.out.println("Ingresa la cantidad del producto " + (i + 1));
            int cantidad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingresa el precio del producto " + (i + 1));
            double precio = sc.nextDouble();
            sc.nextLine();

            // Calculamos el subTotal para cada producto
            double subTotal = cantidad * precio;
            // Actualizamos el total con el subTotal
            total += subTotal;

            // Mostramos la información del producto al usuario
            System.out.println("Producto: " + nombreProducto + ", cantidad: " + cantidad + ", precio: " + precio + ", subTotal: " + subTotal);
            
            
        }
       
        // Mostramos el total al usuario
        System.out.println("El total es: " + total);
    }
}
