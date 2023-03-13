/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author anibal
 */
public class Circulo extends geometria {
    
    private double areaC;

    public Circulo(String nome, double raio) {
        super(nome, raio);
    }
    
    

    @Override
    public double calculaArea() {
       return areaC = 2 * Math.PI * this.getRaio();
    }
    
    
    
}
