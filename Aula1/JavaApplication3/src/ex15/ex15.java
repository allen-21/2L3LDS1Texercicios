/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex15;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex15 {
    /**
     * Faça um programa para calcular e imprimir a hipotenusa de um triangulo
       rectângulo. Os valores dos catetos são introduzidos via teclado.
     */
    public static void main(String [] args){
        
         double catOp,catAdj,hipo;
       
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor do cateto oposto; ");
        catOp= scan.nextDouble();
        System.out.println("Digite o valor do cateto Ajacente; ");
        catAdj= scan.nextDouble();
       
          // o Metodo Math.sqrt serve para operacoes com raiz quadrada
         // o metodo math.pow para elevar um indice exponencial
         
        //hipo = Math.sqrt(Math.pow(catOp, 2) + Math.pow(catAdj, 2));
        hipo = Math.hypot(catOp, catAdj);
         
         System.out.println("A area do circulo e = " + hipo);
    }
    
}
