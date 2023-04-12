/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex13;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex13 {
        public static void main(String [] args){
        
        /**
         *Faça um programa para calcular e imprimir o volume do prisma rectangular.
          Os dados do prisma são introduzidos via teclado.
         */
        
          double comprimento,altura, largura, volume;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a comprimento; ");
        comprimento= scan.nextDouble();
        
         System.out.println("Digite altura; ");
         altura= scan.nextDouble();
         
         System.out.println("Digite largura; ");
         largura= scan.nextDouble();
         
         volume = comprimento*altura*largura;
         
         System.out.println("O volume da prisma retangular e = " +volume);
    }
}
