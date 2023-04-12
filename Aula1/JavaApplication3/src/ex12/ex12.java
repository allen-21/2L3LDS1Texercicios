/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class ex12 {
    public static void main(String [] args){
        
        /**
         * Faça um programa java para calcular e imprimir o perímetro do rectângulo.
            O comprimento e a largura são introduzidos via teclado.
         */
        
          double base,altura, perimetro;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base; ");
        base= scan.nextDouble();
        
         System.out.println("Digite altura; ");
         altura= scan.nextDouble();
         
         perimetro = ((base*2)+(altura*2));
         
         System.out.println("O perimetro do rectangulo com a base = "+base+
                 "\n e altura = " +altura+ "\n e " +perimetro);
    }
    
}
