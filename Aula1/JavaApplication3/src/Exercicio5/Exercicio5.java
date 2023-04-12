/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class Exercicio5 {
    public static void main(String [] args){
        /**
         * Faça um programa que receba o ano do nascimento de uma pessoa e o ano actual.
            Calcule e imprima:
            a) A idade dessa pessoa;
            b) Essa idade convertida em semanas.
         */
        
        int AnoNasc;
        int anoAtual, idade;
        double semanas=52;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Ano de nascimento");
        AnoNasc= scan.nextInt();
        
         System.out.println("Digite o Ano atual");
         anoAtual= scan.nextInt();
         
         idade =anoAtual-AnoNasc;
         semanas*=idade;
         
         System.out.println("Tens; " +idade+"\n e: " +semanas+ " semanas de vida" );
         
    }
    
}
