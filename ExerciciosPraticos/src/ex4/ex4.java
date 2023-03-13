/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;


import java.util.ArrayList;

/**
 *
 * @author anibal
 */
public class ex4 {
    public static void main (String[] args){
        
      
      
      Pessoa f = new Pessoa();
      Pessoa m = new Pessoa();
      Pessoa p = new Pessoa();
      
      f.setNome("allen");
      f.setIdade(15);
      f.setPai(p);
      f.setMae(m);
      m.setNome("Maria");
      p.setNome("Anibal");
      
        System.out.println(f);
    }
    
  
    
}
