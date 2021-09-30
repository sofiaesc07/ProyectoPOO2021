import javax.swing.JOptionPane;

public class Casa {
    //Atributos
    double numero1;
    double multiplicacion;
    double numero2;

    //Método para que el usuario digite
    public void leerNumeros() {
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kWh que genera en su hogar, esto lo puede encontrar en su recibo de luz: "));
        numero2 = 0.385;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;

    }

    public void Resultado(){
        JOptionPane.showMessageDialog(null, "La cantidad de co2 que generas en tu hogar es de: "+multiplicacion+" kg de co2");
    }
}