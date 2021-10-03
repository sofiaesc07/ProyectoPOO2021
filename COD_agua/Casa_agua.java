import java.util.Scanner;

public class Casa_agua {
    //Atributos
    double numero1;
    double multiplicacion;
    double numero2;

    //Método para que el usuario digite
    public void leerNumeros() {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de agua (En m3) que consume en su hogar, esto lo puede encontrar en su recibo de agua: ");
        numero1 = entrada.nextDouble();
        numero2 = 0.788;
        entrada.close();
    }
        

    public void multiplicar() {
        multiplicacion = numero1 * numero2;

    }

    public void Resultado(){
        System.out.println("La cantidad de co2 que generas en tu hogar es de: "+multiplicacion+" kg de co2");
    }
}