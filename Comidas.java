/**************************************************************
Comidas.java

Autores: 
Ana Escobar - 20489


En esta clase se realizara la operacion que calculara para el 
usuario la huella de carbono que genera. Clase Hija
***************************************************************/

public class Comidas extends HuellaCarbono{

    //Constructor de la clase
    public Comidas(double numero1, double numero2, double mes, double año){
        super (numero1, numero2, mes, año);
    }

    //Operación para calcular la huella de carbono de las cosas   
    public double Multiplicacion(){
        multiplicacion = numero1 * numero2; 
        return multiplicacion;
    }

    //Metodo que da un mensaje sobre el resultado de la encuesta
    public void Resultado(){
        System.out.println("La huella de carbono aproximada que generas diariamente es de: " +multiplicacion+ " kg de CO2.");
    }

    //Clase que suma todas las huellas de carbono y aproxima el valor de CO2 en un mes
	public double EstadisticasMes(){
        meses.add(mes);
        for(int i = 0; i < meses.size(); i++){
			estas1 += meses.get(i);
		}
        return mes;
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