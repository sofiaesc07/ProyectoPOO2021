/***************************************************************************
HuellaCarbono.java 

Autores: 
Ana Escobar - 20489

El objetivo de esta clase es aplicar la Herencia, es la clase madre
para simplificar el codigo. Las clases hijas heredaran las caracteristicas 
que comparten.
****************************************************************************/

//importamos todas la libreria util de java
import java.util.*;

public abstract class HuellaCarbono {
    
    //Atributos protected para que sean accesibles unicamente a las clases descendientes de esta
    protected double numero1;
    protected double numero2;
    protected double multiplicacion;
    List<Double> meses = Arrays.asList();
    List<Double> años = Arrays.asList();

    //Constructor de la clase HuellaCarbono
    public HuellaCarbono(double num1, double num2){
        numero1 = num1;
        numero2 = num2;
        multiplicacion = num1 * num2;
    }

    //Getters de la clase HuellaCarbono para cumplir encapsulamiento
    public double getNum1() {
        return numero1;
    }
    public double getNum2() {
        return numero2;
    }
    public double getMult() {
        return multiplicacion;
    }

    //Setters de la clase Combatiente para cumplir encapsulamiento
    public void setNum1(double num1) {
        this.numero1 = num1;
    }
    public void setNum2(double num2) {
        this.numero2 = num2;
    }
    public void setMult(double mult) {
        this.multiplicacion = mult;
    }
    
    //Operación para calcular la huella de carbono de las cosas 
    public double Multiplicacion(){
        multiplicacion = numero1 * numero2;   
        return multiplicacion;
    }

    //Clase del metodo String
    public void Resultado(){
        System.out.println("La huella de carbono aproximada que generas diariamente es de: " +multiplicacion+ " kg de CO2.");
    }

    //Clase que suma todas las huellas de carbono y aproxima el valor de CO2 en un mes
	public void EstadisticasMes(){
		double mes = multiplicacion * 30;
        meses.add(mes);
        double sum = 0;
		for(int i = 0; i < meses.size(); i++)
		{
			sum += meses.get(i);
		}
        System.out.println("La huella de carbono aproximada que generas en un mes es de: " +sum+ " kg de CO2.");
	}

    //Clase que suma todas las huellas de carbono y aproxima el valor de CO2 en un año
	public void EstadisticasAño(){
		double año = multiplicacion * 30;
        años.add(año);
        double sum = 0;
		for(int i = 0; i < años.size(); i++)
		{
			sum += años.get(i);
		}
        System.out.println("La huella de carbono aproximada que generas en un mes es de: " +sum+ " kg de CO2.");
	}
}