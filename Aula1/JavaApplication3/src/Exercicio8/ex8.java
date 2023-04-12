/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio8;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex8 {
    
    /**
     * Escreva um programa que calcule e imprima hipotenusa de um triângulo
        rectângulo. O programa e o programa devem solicitar ao usuário as informações
        necessárias para esse cálculo.
     * 
     */
     public static void main(String [] args){
          double cateto1,cateto2, hipo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a cateto1; ");
        cateto1= scan.nextDouble();
        
         System.out.println("Digite cateto2; ");
         cateto2= scan.nextDouble();
         
         // o Metodo Math.sqrt serve para operacoes com raiz quadrada
         // o metodo math.pow para elevar um indice exponencial
         hipo=Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2));
         
         System.out.println("A hipotenusa e; "+hipo);
    
     }
   
}
