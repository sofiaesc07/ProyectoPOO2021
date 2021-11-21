/***************************************************************************
Listas.java

Autores: 
Ana Escobar - 20489

Con esta clase podremos leer y sobrescribir Arrays en archivos.
****************************************************************************/
//importamos las librerias que utilizamos (Son librerias para el ArrayList de los usuarios)
import java.io.*;
import java.util.*;

class Listas{ 
//Todo esto nos ayudara a que los usuarios se queden guardados incluso si se cierra el programa	
    public void usNuev(ArrayList<usuario> usu){ 
		try{ //Esto nos ayudara a guardar los datos dentro de uestro file Usuarios.txt  
           ObjectOutputStream GuardarDatos = new ObjectOutputStream(new FileOutputStream("Usuarios.txt"));
           GuardarDatos.writeObject(usu);
           GuardarDatos.close();
       }catch (Exception e){}
   }
	public ArrayList<usuario> leerUsuarios(){
		try{//Esto nos ayudara a poder abrir los datos que guardamos en el file
            ObjectInputStream AbrirDatos = new ObjectInputStream(new FileInputStream("Usuarios.txt"));
            ArrayList<usuario> UsuariosTemp= (ArrayList<usuario>) AbrirDatos.readObject();
            AbrirDatos.close();			
            return UsuariosTemp; //devolver la lista si es que existe
        }catch (Exception e){
            return null;
        }
	}
}