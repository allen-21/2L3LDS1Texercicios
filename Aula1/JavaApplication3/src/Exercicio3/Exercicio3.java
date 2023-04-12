/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class Exercicio3 {
    public static void main(String [] args){
        /**
         * Escreva um programa que receba dois números inteiros, calcule e escreva: NB
            cada alínea faça um programa e programa.
            a) Soma dos dois números
            b) Subtracção do primeiro pelo segundo
            c) Subtracção do segundo pelo primeiro
            d) Multiplicação dos dois números
            e) Divisão do primeiro pelo segundo
            f) Divisão do segundo pelo primeiro
            g) o primeiro elevado ao quadrado       
         */
        
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;
        int soma,sub,mult,div,sub1,div1;
        
        System.out.println("Escreva o Primeiro Numero; ");
        n1 = scan.nextInt();
        
        System.out.println("Escreva o Segundo Numero; ");
        n2 = scan.nextInt();
        
        soma= n1+n2;
        sub = n1-n2;
        sub1 = n2-n1;
        mult= n1*n2;
        div= n1/n2;
        div1= n2/n1;
        Math.sqrt(n1);
        
        
        
        System.out.print("Soma; " +soma );
        System.out.print(" Subtracao; " +sub );
        System.out.print(" Subtracao inversa; " +sub1 );
        System.out.print(" Multiplicacao; " +mult );
        System.out.print(" divisao; " +div );
        System.out.print(" divisao inversa; " +div1 );
        System.out.print(" n1 elevado ao quadrado; "+ Math.pow(n1,2));
        
         
        
    }
    
}
