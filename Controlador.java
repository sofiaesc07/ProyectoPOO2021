/**************************************************************
Controlador.java

Autores: 
Ana Escobar - 20489

Con esta clase podremos ingrsesar a los métodos de impresión de 
la clase vista para poder mostrarle el menú al usuario que esté 
interactuando con el programa.
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
		HuellaCarbono temp = null;
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
							v.infor("Ingrese la cantidad de kWh que genera en su hogar, esto lo puede encontrar en su recibo de luz: ");
							double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
							double mes = numero1*0.385*30;
							double año = numero1*0.385*365;
							temp = new Electricidad(numero1, 0.385, mes, año);
							temp.Resultado();//imprime el resultado

						}else if(subOpcion == 2){
							v.infor("Ingrese la cantidad de agua (En m3) que consume en su hogar, esto lo puede encontrar en su recibo de agua: ");
							double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
							double mes = numero1*0.788*30;
								double año = numero1*0.788*365;
							temp = new Agua(numero1, 0.788, mes, año);
							temp.Resultado();//imprime el resultado
											
						}else if(subOpcion == 3){
							v.infor("Ingrese la cantidad de comidas que toma al dia: ");
							double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
							double mes = numero1*1.69*30;
								double año = numero1*1.69*365;
							temp = new Comidas(numero1, 1.69, mes, año);
							temp.Resultado();//imprime el resultado
							
						}else if(subOpcion == 4){
							v.infor("Ingrese el tipo de transporte(por gasolina) con el que se moviliza: ");
							int opcion = 0;
							opcion = v.tipoMovilizar();//se lanza un menú para que el usuairo observe que tipo de opcion de carros hay
							if (opcion == 1){
								v.infor("¿Cuantos kilometros lo recorres diariamente?: ");
								double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
								double mes = numero1*0.7*30;
								double año = numero1*0.7*365;
								temp = new Transporte(numero1, 0.7, mes, año);
								temp.Resultado();//se muestra el resultado

							}else if (opcion == 2){
								v.infor("¿Cuantos kilometros lo recorres diariamente?: ");
								double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
								double mes = numero1*0.9*30;
								double año = numero1*0.9*365;
								temp = new Transporte(numero1, 0.9, mes, año);
								temp.Resultado();//se muestra el resultado	

							}else if (opcion == 3){
								v.infor("¿Cuantos kilometros lo recorres diariamente?: ");
								double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
								double mes = numero1*1.43*30;
								double año = numero1*1.43*365;
								temp = new Transporte(numero1, 1.43, mes, año);
								temp.Resultado();//se muestra el resultado
								
							}else if (opcion == 4){
								v.infor("¿Cuantos kilometros lo recorres diariamente?: ");
								double numero1 = v.pedirNumero();//se pide el valor que se necesita para hacer el calculo de la huella de carbono
								double mes = numero1*1.18*30;
								double año = numero1*1.18*365;
								temp = new Transporte(numero1, 1.18, mes, año);
								temp.Resultado();//se muestra el resultado
								
							}else if (opcion == 5){
								temp = new Transporte(0, 0, 0, 0);
								temp.Resultado();
							}

						}else if(subOpcion == 5){
							
							temp.resumenEstas();

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