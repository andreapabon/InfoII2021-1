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
public class Circulo extends Figura{
    private float radio;

    public Circulo(float radio, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.radio = radio;
    }
    
    public Circulo(){
        super();
        this.radio = 0;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float calcularArea(){
        float area ;
        area = 3.1415f * this.radio * this.radio;
        System.out.println("El área del circulo es: " + area);
        return area;
    }
    
}
