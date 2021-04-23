package Actividades;

public class Actividad_4 {


    public static void main(String[] args) {
        Actividad_4 consola = new Actividad_4();
        consola.fabricante="Sony Interactive Entertainment";
        consola.nombre= "PlayStation 3";
        consola.modelo= "Slim";
        consola.capacidad= 250;
        consola.tipo="Sobremesa";
        
        consola.getNombre();
        consola.getFabricante();
        consola.getModelo();
        consola.getTipo();
        consola.getCapacidad();
    }
    String fabricante,nombre,modelo,tipo;
    int capacidad;
    
    public void getFabricante() {
        System.out.println("La fabricante de la consola es: \n"+ fabricante);
    }
    public void getNombre() {
        System.out.println("El nombre de la consola: \n"+ nombre);
    }
    public void getModelo() {
        System.out.println("Modelo: "+ modelo);
    }
    public void getCapacidad() {
        System.out.println("Capacidad: "+ capacidad+ "GB");
    }
    public void getTipo() {
        System.out.println("Tipo de consola: "+ tipo);
    }    
}
