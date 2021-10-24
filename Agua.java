/**************************************************************
Agua.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146


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

    //Metodo que da un mensaje sobre el resultado de la encuesta
    public void Resultado(){
        System.out.println("La huella de carbono aproximada que generas es de: " +multiplicacion+ " kg de CO2.");
    }
}