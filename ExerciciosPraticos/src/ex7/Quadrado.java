/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author anibal
 */
public class Quadrado extends geometria{
    private double AreaQ;

    public Quadrado(String nome, double altura, double base) {
        super(nome, altura, base);
    }

 
    
    
  @Override
    public double calculaArea() {
        return AreaQ= this.getBase()*this.getBase();
    }
    
    
}
