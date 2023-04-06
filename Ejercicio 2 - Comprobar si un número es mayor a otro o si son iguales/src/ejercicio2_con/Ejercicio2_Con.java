//Ejercicio 2 Pedir dos numeros y decir cual es el mayor o si son iguales
package ejercicio2_con;

import javax.swing.JOptionPane;

public class Ejercicio2_Con {

    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es el uno: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El numero mayor es el dos: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales:");
        }
    }
}
