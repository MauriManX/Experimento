package Actividades;

import java.util.Scanner;

public class Actividad_3 {


    public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    int m;
    double num1, num2;
    String mensaje;
    
    mensaje="Hola, esto ha sido el saludo";
    
    System.out.println("Introduce un numero para seleccionar el metodo"
            + "\n 1 para Sumar 2 numeros"
            + "\n 2 para restar 2 numeros"
            + "\n 3 para mostrar un saludo");
    m=numero.nextInt();
    switch (m){
        case 1:
            System.out.println("Escribe el primer numero");
            num1=numero.nextDouble();
            System.out.println("Escribe el segundo numero");
            num2=numero.nextDouble();
            m1(num1,num2);
        break;
        case 2:
            System.out.println("Escribe el primer numero");
            num1=numero.nextDouble();
            System.out.println("Escribe el segundo numero");
            num2=numero.nextDouble();
            m2(num1,num2);
        break;
        case 3:
            m3(mensaje);
        break;
    }
    }
    //Metodo 1
    public static void m1(double x1, double x2){
     System.out.println("El resultado de la suma es: " + (x1+x2));
    }
    //Metodo 2
        public static void m2(double x1, double x2){
     System.out.println("El resultado de la resta es: " + (x1-x2));
    }
    //metodo 3
        public static void m3(String saludo){
     System.out.println(saludo);
    }    
}
