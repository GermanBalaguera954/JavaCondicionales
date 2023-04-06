/*
Ejercicio11: Construir un programa que simule el funcionamiento de una calculadora que puede
realizar cuatro operaciones aritmeticas basicas(suma, resta, producto y division) con valores
numericos enteros. El usuario debe especificar la operacion con el primer caracter del primer
parametro de la linea de comandos: S o s para suma R o r para la resta P, p, M o m para el producto
o multiplicacion y por ultimo D o d para la division.
 */
package ejercicio11_con;

import javax.swing.JOptionPane;

public class Ejercicio11_Con {

    public static void main(String[] args) {
        int n1, n2, suma, resta, mult, div;
        char operacion;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero uno:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero dos:"));

        operacion = JOptionPane.showInputDialog("Digite la operacion que quiere realizar:").charAt(0);

        switch (operacion) {
            case 's':
            case 'S':
                suma = n1 + n2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = n1 - n2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                mult = n1 * n2;
                JOptionPane.showMessageDialog(null, "La Multiplicacion es: " + mult);
                break;
            case 'd':
            case 'D':
                div = n1 / n2;
                JOptionPane.showMessageDialog(null, "La division es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion ");
        }
    }
}
