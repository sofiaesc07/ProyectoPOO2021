/***************************************************************************
Proyecto Final. Entrega 2 POO
Arrays.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
José Gutiérrez - 201646
Eric Noriega - 211146

Con esta clase podremos leer y sobrescribir Arrays en archivos.
****************************************************************************/

 //importamos las librerias que utilizamos
import java.io.*;
import java.util.*;

class Listas{
	
	public void nuevoU(ArrayList<usuario> usu){
		
		
		 try{
            ObjectOutputStream GuardarDatos = new ObjectOutputStream(new FileOutputStream("Usuarios.txt"));
            GuardarDatos.writeObject(usu);
            GuardarDatos.close();
        }catch (Exception e){}
		
    }
	
//Método que devolvera un ArrayList con objetos de tipo Usuario
	public ArrayList<usuario> leerUsuarios(){
		try{
            ObjectInputStream AbrirDatos = new ObjectInputStream(new FileInputStream("Usuarios.txt"));
            ArrayList<usuario> UsuariosTemp= (ArrayList<usuario>) AbrirDatos.readObject();
            AbrirDatos.close();
			
            return UsuariosTemp; //devolver la lista si existe

        }catch (Exception e){
            return null;
        }
	}
}