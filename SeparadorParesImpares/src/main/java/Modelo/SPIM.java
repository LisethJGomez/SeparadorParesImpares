package Modelo;

import java.util.Stack;

public class SPIM { 
    //Variables
    private Stack<Integer> pila = new Stack<>();
    private Stack<Integer> pares = new Stack<>();
    private Stack<Integer> impares = new Stack<>();

    //Método para llenar la pila 
    public void llenarPila(int[] numeros) {
        for (int num : numeros) {
            pila.push(num);
        }
    }

    // Método para separar los números pares e impares de la pila
    public void separarParesImpares() {
        while (!pila.isEmpty()) {
            int numero = pila.pop();
            if (numero % 2 == 0) {
                pares.push(numero);
            } else {
                impares.push(numero);
            }
        }
    }

    //Getters
    public Stack<Integer> GetPares() {
        return pares;
    }

    public Stack<Integer> GetImpares() {
        return impares;
    }
}