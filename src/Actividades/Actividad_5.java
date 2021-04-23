package Actividades;

public class Actividad_5 {

    public static void main(String[] args) {
        Actividad_5b estudiante1 = new Actividad_5b(10,7,9,3);
        Actividad_5b estudiante2 = new Actividad_5b(8,10,9,12);
        //Cuando estudiante1 y estudiante2 se crean, el constructor hace que los valores dados vayan a sus respectivas variables 
        double pf1,pf2;
        String alum1, alum2, num1, num2;
        
        pf1= estudiante1.promedio();
        pf2= estudiante2.promedio();
        estudiante1.getNumLista();
        
        System.out.println("Hola Claude, tu promedio es: "+pf1);
    }
    
}
