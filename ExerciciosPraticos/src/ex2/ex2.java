/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author anibal
 */


public class ex2 {
    public static void main(String [] args){
        
      Aluno aluno1 = new Aluno(true, "Anibal", 15, 10, 10);
      Aluno aluno2 = new Aluno();
    
      aluno2.setNome("anibal");
        
        aluno1.calcularmedia();
        
        System.out.println(aluno1.getNome());
    }


}
