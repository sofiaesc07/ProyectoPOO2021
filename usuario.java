/***************************************************************************
Usuario.java

Autores: 
Ana Escobar - 20489

Con esta clase se implemento la clase Serializable para poder guardar los 
objetos creados en un documento.
****************************************************************************/
 
//La clase Serializable nos ayudara a que el usuario y la contraseña se queden guardados.
import java.io.Serializable;

class usuario implements Serializable {
	//Atributos
	private String nombre;
	private String contrasena;
	
	//Constructor de la clase
	usuario(String name, String contra){
		nombre = name;
		contrasena = contra;
	}
	
	//getters
	public String getNombre(){
		return nombre;
	}
	
	public String getContrasena(){
		return contrasena;
	}
}