/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              /**
     * 1. Faça um programa que receba o nome e o salário de um funcionário, calcule e
        imprima o nome do funcionário e o valor do imposto de renda a ser pago,
        sabendo que o imposto equivale a 5% do salário.
     */
    
    String nome;
    double salario;
    double imposto = 0.5;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Digite o Nome; ");
    nome = scan.nextLine();
    
    System.out.print("Digite o Salario; ");
    salario = scan.nextInt();
    
    imposto = (salario*imposto)/100;
    
    System.out.println("Nome; "+nome+"\n Salario;"+salario+"\n Imposto; "+imposto);
    
    }
    
}
