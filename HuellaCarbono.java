/***************************************************************************
HuellaCarbono.java 

Autores: 
Ana Escobar - 20489

El objetivo de esta clase es aplicar la Herencia, es la clase madre
para simplificar el codigo. Las clases hijas heredaran las caracteristicas 
que comparten.
****************************************************************************/

//Constructor de la huella de carbono
public abstract class HuellaCarbono {
    
    //Atributos protected para que sean accesibles unicamente a las clases descendientes de esta
    protected double numero1;
    protected double numero2;
    protected double multiplicacion;
    protected double total = 0;
    protected double año;
    protected double mes;
    protected double estas1;
    protected double estas2;

    //Constructor de la clase HuellaCarbono
    public HuellaCarbono(double num1, double num2){
        numero1 = num1;
        numero2 = num2;
        multiplicacion = num1 * num2;
        total += multiplicacion;
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