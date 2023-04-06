/*
Ejercicio6: Hacer un programa que tome dos numeros enteros y diga si ambos son 
pares o impares.
 */
package ejercicio6_con;

import javax.swing.JOptionPane;

public class Ejercicio6_Con {

    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero uno"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero dos"));

        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Los numeros son PARES");
        } else if ((num1 % 2 != 0) && (num2 % 2 != 0)) {
            JOptionPane.showMessageDialog(null, "Los numeros son IMPARES");
        } else {
            JOptionPane.showMessageDialog(null, "Un numero es PAR y el otro IMPAR");
        }

    }

}
