/**************************************************************
Controlador.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
Eric Noriega - 211146

Con esta clase podremos mostrarle el menú al usuario que esté 
interactuando con el programa.
***************************************************************/
class Controlador{
		public static void main(String[] args){
		Vista v = new Vista();
		
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
						if(subOpcion == 1){//pendiente
						}else if(subOpcion == 2){//pendiente
						}else if(subOpcion == 3){//pendiente
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
				}
			}
		}
	}
}