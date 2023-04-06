/*En megaplaza se hace un 20% de descuentoa los clientes cuya compra supere los  $300. 
¿cual sera la cantidad que pagara una persona por su compra.*/
package ejercicio4_con;

import javax.swing.JOptionPane;

public class Ejercicio4_Con {

    public static void main(String[] args) {
        float precioCompra, descuento;

        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Digete el precio de su compra"));
        if (precioCompra > 300) {
            descuento = precioCompra * 0.20f;
            precioCompra -= descuento;

            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        } else {
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        }
    }
}
