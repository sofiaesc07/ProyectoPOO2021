/***************************************************************************
Proyecto Final. Entrega 2 POO
Vista.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
José Gutiérrez - 201646
Eric Noriega - 211146

Con esta clase podremos acceder a los métodos de la clase arrays para 
ejecutar las funcionalidades del programa.
****************************************************************************/

//importamos todas la libreria util de java
import java.util.*;

class Vista{
	private Scanner scan;
	private Listas a;
	
	Vista(){
		
		scan = new Scanner(System.in);
		a = new Listas();
	}

	public int menu(){
		System.out.println("-----------------------------------");
		System.out.println("       BIENVENIDOS A ECO2    ");
		System.out.println("-----------------------------------");
		System.out.println("\n1- Iniciar sesion");
		System.out.println("2- Registrar un usuario");
		System.out.println("3- Mostrar Usuarios");
		System.out.println("4- Salir");
		System.out.print("Ingrese una opción: ");
		int opcion = scan.nextInt();

		return opcion;
		
	}
	
	//Imprimir el sub menú
	public int subMenu(){
		System.out.println("\n1- Realizar encuesta de electricidad");// pendiente
		System.out.println("2- Realizar encuesta de agua");// pendiente
		System.out.println("3- Realizar encuesta de desechos");// pendiente
		System.out.println("4- Realizar encuesta de transporte");// pendiente
		System.out.println("5- Revisar estadisticas y consejos");// pendiente
		System.out.println("6- Salir");
		
		System.out.print("Ingrese una opción: ");
		int opcion = scan.nextInt();
		return opcion;
	}
	
//Usuarios
	//iniciar sesión con usuarios registrados en la base de datos
	public boolean login(){
		boolean logeado = false;
		
		ArrayList<usuario> uu = a.leerUsuarios();
		usuario usuarioTemp = null;

		if(uu != null){
			System.out.print("Ingrese su nombre de usuario: ");
			String nombre = scan.next();
		
			//Comprobaciones de usuario y contraseña al momento de hacer el login
			boolean comprobadorUsuario = false;
			boolean comprobadorContrasena = false;
			
			for(int i = 0 ; i<uu.size() ; i++){
				//variable temporal de tipo usuario
				usuario usuarioLista = uu.get(i);
						
				if(nombre.equals(usuarioLista.getNombre())){
					usuarioTemp = uu.get(i);
				}				
			}
			
			try{ 
				if(nombre.equals(usuarioTemp.getNombre())){
					comprobadorUsuario = true;					
				}
			}catch(Exception e){				
			}
			
			if(comprobadorUsuario == true){
				System.out.print("Ingrese su contrasena: ");
				String contra = scan.next();
			
				try {	
					if(contra.equals(usuarioTemp.getContrasena())){
						comprobadorContrasena = true;	
					}
				}catch(Exception e){					
				}
								
				if(comprobadorContrasena == true){
					System.out.println("\nBIENVENIDO " + usuarioTemp.getNombre() + "\n");
					logeado = true;
				}else{
					System.out.println("----------------------");
					System.out.println("CONTRASENA INCORRECTA");
					System.out.println("----------------------");						
				}
			}else{
				System.out.println("----------------------");
				System.out.println("USURARIO NO ENCONTRADO");
				System.out.println("----------------------");	
			}				
		}else{
			System.out.println("-------------------------------------");
			System.out.println("NO HAY USUARIOS CREADOS, REGISTRE UNO O INTENTE DE NUEVO");
			System.out.println("-------------------------------------");
		}		
		return logeado;		
	}
	
		
	//creamos cada uno de los usuarios y lo mandamos al método de nuevoU de archivos para guardarlo en el txt
	public void crear(){
		
		//ArrayList para almacenar objetos de tipo usuario extraídos de la base de datos 
		ArrayList<usuario> usuariosRep = a.leerUsuarios();
		usuario usuarioTemp;
		
		System.out.print("Ingrese su nombre de usuario: ");
		String nombre = scan.next();
		
		
		//si el archivo existe lo leera y sino lo creará
		if(usuariosRep != null){
			
			int contador=0;
			//recorrer el ArrayList
			for(int i = 0 ; i<usuariosRep.size() ; i++){
				//objeto temporal de tipo usuario
				usuarioTemp = usuariosRep.get(i);
				//se compueba si existe el nombre de usuario
				if(nombre.equals(usuarioTemp.getNombre())){
					contador = 1;
				
				}
			}
			
			//condicionales si el usuario existe o no
			if(contador != 0){
				System.out.println("----------------------");
				System.out.println("EL USUARIO YA EXISTE");
				System.out.println("----------------------");
			}else{
				System.out.print("Ingrese su contrasena: ");
				String contra = scan.next();
				usuario u = new usuario(nombre, contra);
				usuariosRep.add(u);
				a.nuevoU(usuariosRep);
				System.out.println("-----------------------------------");
				System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
				System.out.println("-----------------------------------");
			}
			
		}else{
			System.out.print("Ingrese su contrasena: ");
			String contra = scan.next();
			usuariosRep = new ArrayList<usuario>();
			usuario u = new usuario(nombre, contra);
			usuariosRep.add(u);
			a.nuevoU(usuariosRep);
			System.out.println("-----------------------------------");
			System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
			System.out.println("-----------------------------------");
		}		
	}
	
	//Método para imprimir los usuarios existentes
	public void mostrarUsuarios(){
		//ArrayList que almacenará objetos de tipo usuario 
		ArrayList<usuario> usuariosRep = a.leerUsuarios();
		
		if(usuariosRep == null){
			System.out.println("------------------------------------------------");
			System.out.println("BASE DE DATOS NO ENCONTRADA, REGISTRE UN USUARIO");
			System.out.println("------------------------------------------------");
		}else{
			//Variable temporal de tipo usuario para utilizar sus getters 
			usuario usuarioTemp;
			System.out.println("-----------------------------------");
			
			//Ciclo para recorrer el ArrayList y poder realizar prints de cada usuario 
			for(int i = 0 ; i<usuariosRep.size() ; i++){
				usuarioTemp = usuariosRep.get(i);
				System.out.println("Nombre de usuario: " + usuarioTemp.getNombre());
				System.out.println("Contrasena: " +usuarioTemp.getContrasena() + "\n");
				System.out.println("-----------------------------------");
			}
		}
	}
	
//Salir del perfil y del programa
	
	public boolean salirPerfil(){

		boolean cerrar = true;

		System.out.println("GRACIAS POR UTILIZAR NUESTRA PLATAFORMA");
		System.out.println("VUELVA PRONTO");
		
		return cerrar;
	}
	
	public boolean salirPrograma(){
		
		boolean cerrar = true;

		System.out.println("GRACIAS POR UTILIZAR NUESTRA PLATAFORMA");
		System.out.println("VUELVA PRONTO");
		
		return cerrar;
	}
}