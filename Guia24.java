package unidad2;

import java.util.Scanner;

public class Guia24 {
    public static void main(String[] args) {
        int edad;
        double altura;
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre=leer.next();
        System.out.println("Ingrese su altura: ");
        altura=leer.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad=leer.nextInt();
        System.out.print("Me llamo " + nombre);
        System.out.print(" ,mido " + altura);
        System.out.println(" metros y tengo " + edad + " años");
    }
}
