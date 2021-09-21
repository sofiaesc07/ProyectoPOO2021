/***************************************************************************
Proyecto Final. Entrega 2 POO
Usuario.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
José Gutiérrez - 201646
Eric Noriega - 211146

Con esta clase se implemento la clase Serializable para poder guardar los 
objetos creados en un documento.
****************************************************************************/
 
//Se importa la clase Serializable 
import java.io.Serializable;

//Clase Usuario
class usuario implements Serializable {
	//Atributos
	private String nombre;
	private String contrasena;
	
	//Constructor de la clase
	usuario(String n, String c){
		nombre = n;
		contrasena = c;
	}
	
	//getters de la clase
	public String getNombre(){
		return nombre;
	}
	
	public String getContrasena(){
		return contrasena;
	}
}