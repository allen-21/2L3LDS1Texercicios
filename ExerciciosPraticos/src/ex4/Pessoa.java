/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author anibal
 */
public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa Mae;
    private Pessoa Pai;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Pessoa Mae, Pessoa Pai) {
        this.nome = nome;
        this.idade = idade;
        this.Mae = Mae;
        this.Pai = Pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

 

    public Pessoa getMae() {
        return Mae;
    }

    public void setMae(Pessoa Mae) {
        this.Mae = Mae;
    }

    public Pessoa getPai() {
        return Pai;
    }

    public void setPai(Pessoa Pai) {
        this.Pai = Pai;
    }
    
    
       public String toString(){
        return "nome; " +getNome()+
                "\nIdade; "+this.getIdade()+
                "\nMae; "+this.getMae().getNome()+
                "\nPai; "+ this.getPai().getMae();
    }
   
}
