/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2.pkg0;
import java.util.Scanner;
//import java.util.*;
/**
 *
 * @author DELL
 */
public class Practica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
         int n_articulos;
        double valorp, subtotal = 0, descuento = 0, totalPagar;

        System.out.println("Ingrese cuantos productos desea comprar: ");
        n_articulos = sc.nextInt();

        for (int i = 0; i < n_articulos; i++) {
        System.out.println("Ingrese el precio del producto " + (i + 1) + ": ");
        valorp = sc.nextDouble();
        
        subtotal += valorp;    
    }
        
        if (subtotal >= 300) {
            descuento = subtotal * 0.15;
        } else if (subtotal >= 200) {
            descuento = subtotal * 0.10;
        } else if (subtotal >= 100) {
            descuento = subtotal * 0.05;
        } else {
            descuento = 0;
        }

        totalPagar = subtotal - descuento;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
