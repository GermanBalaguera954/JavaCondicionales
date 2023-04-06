package sentencia_if;

import javax.swing.JOptionPane;

public class Sentencia_if {
    
    public static void main(String[] args) {
        
        //Operador de Igualdad ==
        int numero, dato = 5;        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");            
        }
        
        //Operador Diferente !=
        int numero1, dato1 = 6;        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero1 != dato1) {
            JOptionPane.showMessageDialog(null, "El numero es diferente 6");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es de 6");            
        }
        
        //operador mayor > o mayorigual >=
        int numero2, dato2 = 7;        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero2 >= dato2) {
            JOptionPane.showMessageDialog(null, "El numero es mayor o igual a 7");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es mayor o igual a 7");            
        }
        
        //Operador menor < o menorigualque >=
        int numero3, dato3 = 8;        
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero1 != dato1) {
            JOptionPane.showMessageDialog(null, "EEl numero es menor o igual a 8");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es mayor o igual a 8");            
        }
    }
}
