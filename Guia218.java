package unidad2;

import java.util.Scanner;

public class Guia218 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3=0;
        int i;
        i=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1= leer.nextInt();
        while (i<5) {
            System.out.println("Ingrese el otro número:");
            num2= leer.nextInt();
            if (num1 < num2) {
                num1 = num2;
            }
            System.out.println("Ingrese el otro número:");
            num3= leer.nextInt();
            if (num3 < num2) {
                num3 = num2;
            }
            if (num1 < num3) {
                num1 = num3;
            }
            i=i+1;
        }
        System.out.print("Los dos números mas grandes fueron " + num1 + " y " + num3);
    }
}
