/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author anibal
 */
public abstract  class geometria {
   
    private String nome;
    private double altura;
    private double raio;
    private double base;
   

    public geometria(String nome, double altura, double base) {
        this.nome = nome;
        this.altura = altura;
        this.base = base;
    }

    public geometria(String nome, double raio) {
        this.nome = nome;
        this.raio = raio;
    }
    

    public geometria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
  



 public abstract double calculaArea();
 

 

    
    
}
