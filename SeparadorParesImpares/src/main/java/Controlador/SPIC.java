package Controlador;

import Modelo.SPIM;
import Vista.SPIV;

public class SPIC {
    private SPIM modelo;
    private SPIV vista;

public SPIC(SPIM modelo, SPIV vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

public void separarYMostrar(int[] numeros) {
    modelo.llenarPila(numeros);
    modelo.separarParesImpares();
    vista.mostrarPares(modelo.GetPares());
    vista.mostrarImpares(modelo.GetImpares());
    }
}