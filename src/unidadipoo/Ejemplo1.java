package unidadipoo;

import java.util.Scanner;

/**
 * @author Mauricio
 */
//Detectar si un numero es positivo o negativo y si es par o impar
public class Ejemplo1 {

    public static void main(String[] args) {
        //Declaracion de variable y asignacion de tipo de datos
        int numero;
        
        //Crear un objeto para la introduccion de datos
        Scanner teclado = new Scanner(System.in);
        
        //Mostrar mensaje al usuario
        System.out.println("Introduzca un número");
        //Igualacion para leer el valor contenido en el objeto
        //Correspondiente al tipo entero
        numero = teclado.nextInt();
        
        //Establecer condiciones
        if(numero<0){
            System.out.println("El numero " + numero + " es negativo");
        }else{
            System.out.println("El numero " + numero + " es positivo");
        }
        if(numero%2==0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");
        }
    }
    
}
