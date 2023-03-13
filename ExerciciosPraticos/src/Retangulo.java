/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anibal
 */
public class Retangulo {
    /**
     * 1.Crie uma classe Retângulo com os seguintes atributos:
     * base e altura. Crie um construtor para a classe que receba esses dois atributos e inicialize-os adequadamente.
     * Em seguida, crie um método chamado calcularArea que retorna a área do retângulo (base * altura). 
     * Crie um objeto Retângulo e exiba sua área na tela.

     */
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void calcularArea(){
    
        int area;
        
        area = this.base * this.altura;
        
        System.out.println("a area do retangulo ;" +area);
        
    }
    
    
    
    
}
