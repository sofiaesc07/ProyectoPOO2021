/**************************************************************
Comidas.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146


En esta clase se realizara la operacion que calculara para el 
usuario la huella de carbono que genera. 
***************************************************************/

import java.util.Scanner;

public class Comidas {
    //Atributos
    double numero1;
    double multiplicacion;
    double numero2;

  //Cuerpo del programa. En el caso de las comidas solo se puede dar un valor aproximado debido a que no existe un factor estandarizado.
	//}
    
    public double getNumero1(){
    return numero1;
   }

    public void leerNumeros() {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de comidas que hace al día (normalmente de tres a cinco): ");
        numero1 = entrada.nextDouble();
        numero2 = 1.69;
        multiplicacion = numero1 * numero2; //Operación para calcular la huella de carbono de las comidas   
    }
        
    public void Resultado(){
        System.out.println("La huella de carbono aproximada que generas diariamente al comer es de: "+multiplicacion+ " kg de CO2.");
    }
}