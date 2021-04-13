/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsejemplo;

import java.util.ArrayList;


/**
 *
 * @author Andrea Pabón
 */
public class ArrayListsEjemplo {
    

  
    public static void main(String[] args) {
       String[] frutas = new String[5];            
       frutas[0] = "Mango";
       frutas[3] = "Fresa";
       
       for (int i = 0; i < 5; i++){
           System.out.println("Posición " + i + ": " + frutas[i]);
       }
       
       ArrayList<String> listaFrutas = new ArrayList<String>();
       System.out.println("******* ArrayList *******************");
       listaFrutas.add("Manzana");
       listaFrutas.add("Melocoton");
       int tam = listaFrutas.size();
       
       for(int j = 0; j < tam; j++){
           System.out.println("Posicion " + j + " : " + listaFrutas.get(j));
       }
        System.out.println("agregué en la pos 0");
       listaFrutas.add(0, "Sandia");
       tam = listaFrutas.size();
        for(int j = 0; j < tam; j++){
           System.out.println("Posicion " + j + " : " + listaFrutas.get(j));
       }
        
        int posElemento = listaFrutas.indexOf("Manzana");
        System.out.println("El indice de manzana es: " + posElemento);
        
        listaFrutas.remove(2);
        
       
    }
    
   
    
   
    
}
