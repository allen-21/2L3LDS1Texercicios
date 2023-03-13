/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author anibal
 */
public class Triangulo extends geometria{
    
    private double areaT;

    public Triangulo(String nome, double altura, double base) {
        super(nome, altura, base);
    }

    @Override
    public double calculaArea() {
        return areaT=(this.getBase() * this.getAltura())/2;
    }
    
}
