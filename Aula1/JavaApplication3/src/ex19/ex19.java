/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex19;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex19 {
    
    /**
     * Faça um programa para calcular e imprimir o catecto1. Os outros valores do
       triangulo rectângulo são introduzidos via teclado.
     * @param args 
     */
    
     public static void main(String args[]){
         
        Scanner scan= new Scanner(System.in);
        double hipo, catAdj, catOps;
        System.out.print("Digite o valor da hipotenusa: ");
        hipo = scan.nextDouble();
        scan.nextLine();
        System.out.print("Digite o valor do cateto ajacante: ");
        catAdj = scan.nextDouble();
         
   
   
    // calcular a medida da cateto oposto
    catOps = Math.sqrt(Math.pow(hipo, 2) - Math.pow(catAdj, 2));
  
   
    System.out.println("A medida do cateto oposto e: " + catOps);
  }
    
}
