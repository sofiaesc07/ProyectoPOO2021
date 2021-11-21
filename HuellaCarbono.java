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
    protected List<Double> meses = Arrays.asList();
    protected List<Double> años = Arrays.asList();
    protected double año;
    protected double mes;
    protected double estas1;
    protected double estas2;

    //Constructor de la clase HuellaCarbono
    public HuellaCarbono(double num1, double num2, double mes, double año){
        numero1 = num1;
        numero2 = num2;
        multiplicacion = num1 * num2;
        mes = multiplicacion * 30;
        año = multiplicacion * 365;
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
    public double getMes() {
        return mes;
    }
    public double getAño() {
        return año;
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
    public void setMes(double mese) {
        this.mes = mese;
    }
    public void setAño(double year) {
        this.año = year;   
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
	public double EstadisticasMes(){
        meses.add(mes);
        for(int i = 0; i < meses.size(); i++){
			estas1 += meses.get(i);
		}
        return año;
	}

    //Clase que suma todas las huellas de carbono y aproxima el valor de CO2 en un año
	public double EstadisticasAño(){
        años.add(año);
		for(int i = 0; i < años.size(); i++){ 
            estas2 += años.get(i);
		}
        return año; 
	}

    public void resumenEstas(){
        System.out.println("La huella de carbono aproximada que generas en un mes es de: " +estas1+ " kg de CO2.");
        System.out.println(" ");
        System.out.println("La huella de carbono aproximada que generas en un años es de: " +estas2+ " kg de CO2.");
        System.out.println(" ");
    }

}