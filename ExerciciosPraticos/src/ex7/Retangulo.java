/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author anibal
 */
public class Retangulo extends geometria {
    
    public double areaR;

    public Retangulo(String nome, double altura, double base) {
        super(nome, altura, base);
    }

 
   public double calculaArea() {
        return  areaR = this.getBase() * this.getAltura();
    }

  
 

     
    
    
}
