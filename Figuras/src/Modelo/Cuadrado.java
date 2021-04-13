/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andrea Pabón
 */
public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(float lado, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.lado = lado;
    }

    public Cuadrado(){
        super();
        this.lado = 0;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float calcularArea(){
        float area; 
        area = this.lado * this.lado;
        System.out.println("El área del cuadrado es: " + area);
        return area;
    }
    
}
