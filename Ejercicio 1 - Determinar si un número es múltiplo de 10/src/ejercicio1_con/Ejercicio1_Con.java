package ejercicio1_con;

import javax.swing.JOptionPane;

public class Ejercicio1_Con {

    public static void main(String[] args) {

        //Hcer un programa que lea un numero entero y muestre si es multiplo de 10
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));

        //Se sabe si es multiplo de un numero con el modulo y su reciduo es igual a cero
        if (num % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " es multiplo de diez");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");        
        }
    }
}
