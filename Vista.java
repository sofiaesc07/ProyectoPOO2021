/***************************************************************************
Vista.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146

Con esta clase podremos acceder a los métodos de la clase arrays para 
ejecutar las funcionalidades del programa.
****************************************************************************/

//importamos todas la libreria util de java
import java.util.*;

class Vista{
	private Scanner scan;
	private Listas l;
	
	Vista(){
		
		scan = new Scanner(System.in);
		l = new Listas();
	}
	//Menu inicial en donde se registrara un usuario para poder utilizar el programa.
	public int menu(){
		
		int opcion = 0;
		System.out.println("-----------------------------------");
		System.out.println("       BIENVENID@S A ECO2    ");
		System.out.println("-----------------------------------");
		System.out.println("1- Iniciar sesion");
		System.out.println("2- Registrar un usuario");
		System.out.println("3- Mostrar Usuarios");
		System.out.println("4- Salir" + "\n");
		System.out.print("Ingrese una opción: ");
  		
		//Comprobamos que el numero ingresado por el usuario se encuentre dentro de 
		//nuestro rango de opciones y que sea un int      
		boolean continuar = false;
		while (!continuar){
            try{
				opcion = scan.nextInt();
                scan.nextLine();
				if(opcion > 0 && opcion < 5){
                    continuar = true;
                }else{
                    System.out.println("La opcion seleccionada no se encuentra en el menu de opciones.");
                    System.out.println("Seleccione una opcion entre 1 y 4");
                }
            }catch(java.util.InputMismatchException excepcion){
                System.out.println("Error. Opción ingresada fuera de rango.");
                System.out.println("Coloque de nuevo la opción: ");
                scan.nextLine();
			}
		}return opcion;
	}
	
	//Menú 2 o submenu del programa para realizar las ecuestas
	public int subMenu(){

		int opcion = 0;
		System.out.println("\n¿Que deseas hacer?");
		System.out.println("\n1- Realizar encuesta de electricidad");
		System.out.println("2- Realizar encuesta de agua");
		System.out.println("3- Realizar encuesta de alimentacion");
		System.out.println("4- Realizar encuesta de transporte");// pendiente
		System.out.println("5- Revisar estadisticas y consejos");// pendiente
		System.out.println("6- Salir" + "\n");

		//Comprobamos que el numero ingresado por el usuario se encuentre dentro de 
		//nuestro rango de opciones y que sea un int
		boolean continuar = false;
		while (!continuar){
            try{
				opcion = scan.nextInt();
                scan.nextLine();
				if(opcion > 0 && opcion < 7){
                    continuar = true;
                }else{
                    System.out.println("La opcion seleccionada no se encuentra en el menu de opciones.");
                    System.out.println("Seleccione una opcion entre 1 y 6");
                }
            }catch(java.util.InputMismatchException excepcion){
                System.out.println("Error. Opción ingresada fuera de rango.");
                System.out.println("Coloque de nuevo la opción: ");
                scan.nextLine();
			}
		}return opcion;

	}
	
	//Usuarios y contraseñas del programa 

	//iniciar sesión con usuarios registrados en la base de datos
	public boolean login(){
		boolean logeado = false;
		
		ArrayList<usuario> uu = l.leerUsuarios();
		usuario usuarioTemp = null;

		if(uu != null){
			System.out.print("\nIngrese su nombre de usuario: ");
			String nombre = scan.next();
		
			//Esto es para comprobar que los usuarios y las contraseñas existen y estan guardados.
			boolean comprobadorUsuario = false;
			boolean comprobadorContrasena = false;
			
			//Aqui comprobamos que el usuario que estamos ingresando si exista
			for(int i = 0 ; i<uu.size() ; i++){
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
			//Aqui comprobaremos si la contraseña que estamos ingresando pertenece al usuario
			if(comprobadorUsuario == true){
				System.out.print("Ingrese una contrasena: ");
				String contra = scan.next();
			
				try {	
					if(contra.equals(usuarioTemp.getContrasena())){
						comprobadorContrasena = true;	
					}
				}catch(Exception e){					
				}
								
				if(comprobadorContrasena == true){
					System.out.println("\n--- BIENVENID@ " + usuarioTemp.getNombre() + "--- \n");
					logeado = true;
				}else{
					System.out.println(" ");
					System.out.println("CONTRASENA INCORRECTA, INTENTE DE NUEVO");
					System.out.println(" ");						
				}
			}else{
				System.out.println(" ");
				System.out.println("USURARIO NO ENCONTRADO, INTENTE DE NUEVO O REGISTRE UNO");
				System.out.println(" ");	
			}				
		}else{
			System.out.println(" ");
			System.out.println("NO HAY USUARIOS CREADOS, REGISTRE UNO O INTENTE DE NUEVO");
			System.out.println(" S");
		}		
		return logeado;		
	}
			
	//creamos cada uno de los usuarios y lo mandamos a listas para guardarlo en el txt
	public void crear(){
		
		//ArrayList para almacenar objetos de tipo usuario extraídos de la base de datos 
		ArrayList<usuario> usuariosRep = l.leerUsuarios();
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
			
			//condicionales para demostrar si el usuario ya existe o no
			if(contador != 0){
				System.out.println(" ");
				System.out.println("EL USUARIO YA EXISTE");
				System.out.println(" ");
			}else{
				System.out.print("Ingrese su contrasena: ");
				String contra = scan.next();
				usuario u = new usuario(nombre, contra);
				usuariosRep.add(u);
				l.usNuev(usuariosRep);
				System.out.println(" ");
				System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
				System.out.println(" ");
			}
		}else{
			System.out.print("Ingrese su contrasena: ");
			String contra = scan.next();
			usuariosRep = new ArrayList<usuario>();
			usuario u = new usuario(nombre, contra);
			usuariosRep.add(u);
			l.usNuev(usuariosRep);
			System.out.println(" ");
			System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
			System.out.println(" ");
		}		
	}
	
	//Imprimir los usuarios con sus contraseñas por si una persona no se acuerda de estos.
	public void mostrarUsuarios(){
		//ArrayList para guardar los usuarios
		ArrayList<usuario> usuariosRep = l.leerUsuarios();
		
		if(usuariosRep == null){
			System.out.println(" ");
			System.out.println("BASE DE DATOS NO ENCONTRADA, REGISTRE UN USUARIO");
			System.out.println(" ");
		}else{
			//Variable temporal de tipo usuario para utilizar sus getters 
			usuario usuarioTemp;
			System.out.println(" ");
			
			//Ciclo para poder imprimir los usuarios con sus respectivas contraseñas
			for(int i = 0 ; i<usuariosRep.size() ; i++){
				usuarioTemp = usuariosRep.get(i);
				System.out.println("-----------------------------------");
				System.out.println("Usuario: " + usuarioTemp.getNombre());
				System.out.println("Contrasena: " +usuarioTemp.getContrasena());
				System.out.println("-----------------------------------" + "\n");
			}
		}
	}
    //Mostrar informacion pasada por un parametro String
    public void infor(String info_mostrar){
        System.out.println(info_mostrar);
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

	//Le pedira el numero al usuario para saber sus datos al momento de calcular el CO2.s
	public double pedirNumero(){
		double numero1 = 0;
		try{
			numero1 = scan.nextDouble();
			scan.nextLine();
	//Excepcion si el usuario ingresa un dato no numerico
		}catch(java.util.InputMismatchException excepcion){
			System.out.println("Error. La opcion seleccionada debe ser numerica.");
			System.out.println("Coloque de nuevo la opción: ");			
			scan.nextLine();
		} return numero1;
	}
}