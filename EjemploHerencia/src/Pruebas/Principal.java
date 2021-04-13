/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import Modelo.Animal;
import Modelo.Caballo;
import Modelo.Gato;
import Modelo.Perro;
import java.util.ArrayList;


/**
 *
 * @author Andrea Pabón
 */
public class Principal {
    
    public static void main(String[] args){
        
        Gato gatito = new Gato("Tom", 5, 9.5f);
        Perro perrito = new Perro("Firulais", 8, 10);
        
        gatito.comer();
        perrito.comer();
        
        perrito.hacerRuido();
        perrito.dormir();
        
        Caballo caballito = new Caballo("Pony", 15, 20);
        caballito.hacerRuido();
        
        gatito.hacerRuido();
        
        ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
        listaAnimales.add(perrito);
        listaAnimales.add(gatito);
        listaAnimales.add(caballito);
        
    }
    
}
