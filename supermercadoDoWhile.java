
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
public class supermercadoDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generamos un número aleatorio de productos entre 1 y 23
        int numProductos = random.nextInt(23) + 1;

        System.out.println("Se generaron " + numProductos + " productos");

        double total = 0;
        int i = 0; // Contador para controlar el número de productos actual
        do {
            System.out.println("Ingresa el nombre del producto " + (i + 1));
            String nombreProducto = sc.nextLine();

            System.out.println("Ingresa la cantidad del producto " + (i + 1));
            int cantidad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingresa el precio del producto " + (i + 1));
            double precio = sc.nextDouble();
            sc.nextLine();

            // Calculamos el sub total y lo sumamos al total
            double subTotal = cantidad * precio;
            total += subTotal;

            System.out.println("Producto: " + nombreProducto + ", cantidad: " + cantidad + ", precio: " + precio + ", subTotal: " + subTotal);
            i++;
        } while (i < numProductos); // El ciclo se repetirá hasta que se hayan ingresado todos los productos

        System.out.println("El total es: " + total);
    }
}
