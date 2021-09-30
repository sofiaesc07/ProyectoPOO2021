import java.util.Scanner;

public class Casa {
    //Atributos
    double numero1;
    double multiplicacion;
    double numero2;

    //Método para que el usuario digite
    public void leerNumeros() {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kWh que genera en su hogar, esto lo puede encontrar en su recibo de luz: ");
        numero1 = entrada.nextDouble();
        numero2 = 0.385;
        entrada.close();
    }
        

    public void multiplicar() {
        multiplicacion = numero1 * numero2;

    }

    public void Resultado(){
        System.out.println("La cantidad de co2 que generas en tu hogar es de: "+multiplicacion+" kg de co2");
    }
}