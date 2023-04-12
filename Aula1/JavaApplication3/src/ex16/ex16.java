/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex16;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex16 {
    
    /**
     * Faça um programa para calcular e imprimir o volume de uma pirâmide
        rectangular.
     * @param args 
     */
     public static void main(String [] args){
        
         double baseA,baseB,altura, volume;
       
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da BaseA; ");
        baseA= scan.nextDouble();
        System.out.println("Digite o valor da BaseB; ");
        baseB= scan.nextDouble();
        System.out.println("Digite o valor do Altura; ");
        altura= scan.nextDouble();
       
        volume= ((baseA*baseB)*altura)/3;
         
         System.out.println("A area do circulo e = " + volume );
    }
}
