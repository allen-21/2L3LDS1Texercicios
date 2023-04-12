/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex10 {
    
    /**
     * 
     *  Faça um programa para calcular e imprimir a área do trapézio. Os dados do
         trapézio são introduzidos via teclado. 
     */
    
      public static void main(String [] args){
          double baseMaior,baseMenor, altura, area;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base maior do trapezio; ");
        baseMaior= scan.nextDouble();
        
         System.out.println("Digite a base menor do trapezio; ");
         baseMenor= scan.nextDouble();
         
         System.out.println("Digite a altura; ");
         altura= scan.nextDouble();
         
        area = ((baseMaior + baseMenor)* altura)/2;
         
         System.out.println("A hipotenusa e; "+ area);
    
     }
}
