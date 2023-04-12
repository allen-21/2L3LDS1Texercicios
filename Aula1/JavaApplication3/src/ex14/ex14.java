/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex14 {
      public static void main(String [] args){
        
        /**
         *Faça um programa java para calcular e imprimir a área do circulo. Os dados
           do circulo são introduzidos vial teclado.
         */
        
          double area,raio;
       
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor raio; ");
        raio= scan.nextDouble();
       //metodo math.pi traz o valor aproximado ao pi
        area = 2 * Math.PI * raio;
         
         System.out.println("A area do circulo e = " + area);
    }
}
