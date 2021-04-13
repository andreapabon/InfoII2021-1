/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Modelo.Circulo;
import Modelo.Cuadrado;
import java.util.ArrayList;

/**
 *
 * @author Andrea Pabón
 */
public class Principal {
    
    public static void main(String[] args){
        Circulo c = new Circulo(9, "Figura circulo","Figura que representa circulo");
        Cuadrado cuad = new Cuadrado(7, "Cuadrado" , "Fig. Cuadrada");
        float areaCirculo = c.calcularArea();
        float areaCuadrado = cuad.calcularArea();
        
    }
    
    
}
