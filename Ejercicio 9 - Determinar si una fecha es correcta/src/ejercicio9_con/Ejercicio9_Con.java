/*
Ejercicio9: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta
suponiendo que todos los meses son de 30 dias.
 */
package ejercicio9_con;

import javax.swing.JOptionPane;

public class Ejercicio9_Con {

    public static void main(String[] args) {
        int dia, mes, anio;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));

        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)) {
                if (anio != 0) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El anio digitado es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes digitado es incorrecto");
            }

        } else {
            JOptionPane.showMessageDialog(null, "El dia digitado es incorrecto");
        }
    }

}
