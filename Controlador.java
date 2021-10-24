/**************************************************************
Controlador.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146

Con esta clase podremos ingrsesar a los métodos de impresión de la clase.
vista para poder mostrarle el menú al usuario que esté interactuando con el programa.
***************************************************************/

class Controlador{
	
	//atributo para llamar méotods de la clase vista
	private Vista v;
	
	//constructor de la clase
	Controlador(){
		//instancia de la clase vista
		v = new Vista();
	}

	public void programa(){
		//opciones del menú principal
		int num = 0;
		while(num != 4){
			num = v.menu();
			
			if(num == 1){
				if(v.login()){
					
					//opciones del sub menú
					int subOpcion = 0;
					while(subOpcion != 6){
						
						subOpcion = v.subMenu();
						if(subOpcion == 1){
							Electricidad e = new Electricidad();
							e.leerNumeros();
							e.Resultado();

						}else if(subOpcion == 2){
							Agua a = new Agua();
							a.leerNumeros();
							a.Resultado();
							
						}else if(subOpcion == 3){
							Comidas c = new Comidas();
							c.leerNumeros();
							c.Resultado();
							
						}else if(subOpcion == 4){//pendiente
						}else if(subOpcion == 5){//pendiente
						}else if(v.salirPerfil()){
							subOpcion = 6;
						}
					}
				}
			}else if(num == 2){
				v.crear();
			}else if(num ==3){
				v.mostrarUsuarios(); 
				
			}else if(num == 4){
				if(v.salirPrograma()){
					break;
				}
			}
		}
	}
}