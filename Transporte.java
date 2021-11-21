/**************************************************************
Transporte.java

Autores: 
Ana Escobar - 20489

En esta clase se realizara la operacion que calculara para el 
usuario la huella de carbono que genera. Clase Hija
***************************************************************/

public class Transporte extends HuellaCarbono{

    //Constructor de la clase
    public Transporte(double numero1, double numero2){
        super (numero1, numero2);
    }

    //Operación para calcular la huella de carbono de las cosas   
    public double Multiplicacion(){
        multiplicacion = numero1 * numero2; 
        return multiplicacion;
    }

    //Metodo que da un mensaje sobre el resultado de la encuesta
    public void Resultado(){
        System.out.println("La huella de carbono que has generado es de: " +multiplicacion+ " kg de CO2.");
    }

        //Clase que suma todas las huellas de carbono y aproxima el valor de CO2 en un mes
/*	public void EstadisticasMes(){
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
	}*/
}