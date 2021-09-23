/***************************************************************************
Listas.java

Autores: 
Erick Bolaños - 20227
Ana Escobar - 20489
José Gutiérrez - 201646
Eric Noriega - 211146

Con esta clase podremos leer y sobrescribir Arrays en archivos.
****************************************************************************/

public class Energia {
    
    private int personas;
    private int consumo;
    private int aparatoselec;
    private int lucescasa;

    public Energia() {
        personas = 0;
        consumo = 0;
        aparatoselec = 0;
        lucescasa = 0;
    }

    public Energia(int pp, int con, int apa, int luz){
        personas = pp;
        consumo = con;
        aparatoselec = apa;
        lucescasa = luz;
    }
}
