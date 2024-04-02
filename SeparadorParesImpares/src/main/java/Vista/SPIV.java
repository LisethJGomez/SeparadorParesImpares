package Vista;

import Controlador.SPIC;
import Modelo.SPIM;
import java.util.Stack;
import javax.swing.JOptionPane;

public class SPIV {
       public static void main(String[] args) { //Creación de instancias
        SPIM modelo = new SPIM();
        SPIV vista = new SPIV();
        SPIC controlador = new SPIC(modelo, vista);

        String input = JOptionPane.showInputDialog("Ingrese los números separados por espacios:");
        String[] strNumeros = input.split("\\s+");
        int[] numeros = new int[strNumeros.length];
        for (int i = 0; i < strNumeros.length; i++) {
            numeros[i] = Integer.parseInt(strNumeros[i]);
        }
        
    //Llamar al método del controlador para separar y mostrar los números pares e impares
        controlador.separarYMostrar(numeros); 
    }
        public void mostrarPares(Stack<Integer> pares) {
        StringBuilder mensaje = new StringBuilder("Números pares:\n");
        while (!pares.isEmpty()) {
            mensaje.append(pares.pop()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public void mostrarImpares(Stack<Integer> impares) {
        StringBuilder mensaje = new StringBuilder("Números impares:\n");
        while (!impares.isEmpty()) {
            mensaje.append(impares.pop()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
