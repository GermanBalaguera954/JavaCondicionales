/*
Ejercicio13: Hacer un programa que simule un cajero con un saldo inicial de $1000 dolares
con el siguiente menu de opciones:

1. Ingresa dinero a la cuenta.
2. Retira dinero de la cuenta.
3. Salir.
 */
package ejercicio13_con;

import javax.swing.JOptionPane;

public class Ejercicio13_Con {

    public static void main(String[] args) {
        final int saldoInical = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero\n"
                + "1. Ingresa dinero a la cuenta\n"
                + "2. Retira dinero de la cuenta\n"
                + "3. Salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que quiere ingresar "));
                saldoActual = saldoInical + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en la cuenta" + saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que quiere retirar "));

                if (retiro > saldoInical) {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro ");
                } else {

                    saldoActual = saldoInical - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Se equivoco de opcion de menu");
                break;
        }
    }

}
