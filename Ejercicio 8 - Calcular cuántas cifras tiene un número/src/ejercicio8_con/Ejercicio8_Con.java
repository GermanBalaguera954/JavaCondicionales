/*
Ejercicio8: Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene.
 */
package ejercicio8_con;

import javax.swing.JOptionPane;

public class Ejercicio8_Con {

    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if (num < 10) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " tiene una cifras");
        } else if (num < 100) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " tiene dos cifras");
        } else if (num < 1000) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " tiene tres cifras");

        } else if (num < 10000) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " tiene cuatro cifras");
        } else if (num < 100000) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " tiene cinco cifras");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + num + " tiene mas cifras");
        }
    }
}
