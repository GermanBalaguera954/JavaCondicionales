package operadorternario;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {

        //Operador Ternario es el signo de interrogacion ?
        int num;
        String mensaje;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        mensaje = (num % 2 == 0) ? "El numero es Par" : "El numero es Impar";
        
        JOptionPane.showMessageDialog(null, mensaje);

    }

}
