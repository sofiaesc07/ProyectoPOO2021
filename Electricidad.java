/**************************************************************
Controlador.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146

En esta clase se realizara la operacion que calculara para el 
usuario la huella de carbono que genera. 
***************************************************************/

import java.util.Scanner;

public class Electricidad {
    //Atributos
    double numero1;
    double multiplicacion;
    double numero2;

  //Electricidad(double num1){
		//numero1 = num1;
	//}
    
    public double getNumero1(){
    return numero1;
   }

    public void leerNumeros() {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kWh que genera en su hogar, esto lo puede encontrar en su recibo de luz: ");
        numero1 = entrada.nextDouble();
        numero2 = 0.385;
        multiplicacion = numero1 * numero2; //Operacion para calcular la huella de carbono   
    }
        
    public void Resultado(){
        System.out.println("La huella de carbono que generas en tu hogar es de: "+multiplicacion+ ".");
    }
}