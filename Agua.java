/**************************************************************
Agua.java

Autores: 
Ana Escobar - 20489

En esta clase se realizara la operacion que calculara para el 
usuario la huella de carbono que genera. Clase Hija.
***************************************************************/

public class Agua extends HuellaCarbono{

    //Constructor de la clase
    public Agua(double numero1, double numero2){
        super (numero1, numero2);
    }

    //Operación para calcular la huella de carbono de las cosas 
    public double Multiplicacion(){
        multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    
    //Operación para calcular la huella de carbono general
    public void operacion(){
        mes = total * 30;
        año = total * 365;
    }

    //Clase del metodo String
    public double Resultado(){
        System.out.println("La huella de carbono aproximada que generas diariamente es de: " +multiplicacion+ " kg de CO2.");
        return multiplicacion;
    }

    //Clase que imprime las estadisticas en orden
    public void resumenEstas(double factura){
        double porMes= factura *30;
        double porAno= factura *365;
        System.out.println("La huella de carbono aproximada que generas en un mes es de: " +porMes+ " kg de CO2.");
        System.out.println("La huella de carbono aproximada que generas en un años es de: " +porAno+ " kg de CO2.");
    }

}