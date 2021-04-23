package Actividades;

/**
 *
 * @author Mauricio
 */
public class Actividad_5b {
    double calif1, calif2, calif3;
    int numLista;

    Actividad_5b (double x1, double x2, double x3,int x4){ //Cosntructor
        calif1=x1;
        calif2=x2;
        calif3=x3;
        numLista=x4;
    }
    double promedio (){
        return (calif1+calif2+calif3)/3;
    }
    public void getNumLista(){
        System.out.println(numLista);
    }
    
 }
