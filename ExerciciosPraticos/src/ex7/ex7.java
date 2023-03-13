/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author anibal
 */
public class ex7 {
    public static void main(String[] args){
        
Retangulo r1 = new Retangulo("Retangulo",2,4);
Quadrado q1 = new Quadrado ("Quadrado",2,4);
Triangulo t1 = new Triangulo("triangulo", 2, 4);
Circulo c1 = new Circulo("Circulo", 4);

Resultados(r1);
Resultados(q1);
Resultados(t1);
Resultados(c1);



    }
     private static void Resultados(geometria f){
     System.out.println("Area do " +f.getNome()+ ": "+f.calculaArea());
 }
  
}
