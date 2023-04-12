/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex18;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex18 {
    /**
     *  Faça um programa para calcular e imprimir o volume do cilindro. Os dados
        do volume são introduzidos via teclado.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double altura, raio, volume;
        System.out.print("Digite o valor do altura: ");
        altura = scan.nextDouble();
        scan.nextLine();
        System.out.print("Digite o valor do raio: ");
        raio = scan.nextDouble();
        scan.nextLine();
        volume=Math.PI*raio*raio*altura;
        System.out.println("O valor do volume: " + volume);
    }

}
