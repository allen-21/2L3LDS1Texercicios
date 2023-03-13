/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author anibal
 */
public class ex3 {
    public static void main (String[] args){
        
        Carro c1 = new Carro();
        Carro c2 = new Carro("Toyota", 2022, "Vermelho", 200, true);
        Carro c3 = new Carro("BMW", 2022, "Preta", 0, true);
        
        c1.setModelo("VW");
        c1.setCor("Preto");
        c1.setAno(2022);
        c1.setVelocidade(0);
        c1.setLigado(false);
        
        c1.detalhes();
        c2.detalhes();
        c3.detalhes();
        
        System.out.println(c1.situacaoMotor());
        System.out.println(c2.situacaoMotor());
        System.out.println(c3.situacaoMotor());
        
        System.out.println(c1.ligar());
        
         System.out.println(c1.situacaoMotor());
         System.out.println(c2.situacaoMotor());
         
       
         System.out.println(c2.desligar());
         System.out.println(c3.desligar());
         
       

         System.out.println(c2.situacaoMotor());
         System.out.println(c3.situacaoMotor());
         
         System.out.println(c2.acelerar(30));
         System.out.println(c3.acelerar(50));
         System.out.println(c1.acelerar(30));
         
         
          System.out.println(c1.situacaoMotor());
        System.out.println(c2.situacaoMotor());
        System.out.println(c3.situacaoMotor());
        
        
         System.out.println(c2.frear(120));
         System.out.println(c1.frear(40));
         System.out.println(c3.frear(100));
    }
    
}
