/***************************************************************************
Principal.java 

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146

Con esta clase se puede inicializar el programa e invoca a la clase vista 
para que el usuario pueda interactuar con el perfil. 
***************************************************************************/

public class Principal {
    public static void main(String[] args) {

        Controlador cn;
        cn = new Controlador();
        cn.programa();
    }
}