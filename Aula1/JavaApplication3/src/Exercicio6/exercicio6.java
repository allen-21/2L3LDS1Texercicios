/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class exercicio6 {
    public static void main(String [] args){
        
        /**
         *  Escreva um programa que calcule e imprima a área de um rectângulo. O
            programa deve solicitar ao usuário as informações necessárias para esse cálculo.
         */
        
          double base,altura, areaRetangulo ;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base; ");
        base= scan.nextDouble();
        
         System.out.println("Digite altura; ");
         altura= scan.nextDouble();
         
         areaRetangulo= base*altura;
         
         System.out.println("A area do retangulo com a base = "+base+
                 "\n e altura = " +altura+ "\n e " +areaRetangulo);
    }
}
