/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author anibal
 */
public class Carro {
    
    
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;
    private boolean ligado;

    public Carro(String modelo, int ano, String cor, int velocidade, boolean ligado) {
        this.modelo = modelo;
        this.ano = ano; 
        this.cor = cor;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }
    

    public Carro() {
    }

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
        this.ligado = false;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void detalhes(){
        
        System.out.println("modelo " + this.modelo + " \n ano " + this.ano + "\n cor "+ this.cor + " \n ==============");
        
    }
    public String situacaoMotor(){
    if (this.ligado){
        return this.modelo + " --> Motor LIGADO";
    }
    return this.modelo + " --> Motor Desligado";
    }

    public String ligar(){
    if (this.ligado){
        return "O motor do  " + this.modelo + " Ja esta ligado";
    }
      this.ligado = true; //ligar o motor
         return "O motor do  " + this.modelo + " foi ligado agora";
    }
    
    public String desligar(){
        // se o motor estiver desligado(false);
        if (!this.ligado){
           return "O motor do  " + this.modelo + " Ja esta Desligado"; 
        }
        //Verificar se a velocidade do carro e zero
        if(this.velocidade == 0){
            //desligar o motor
            this.ligado = false;
            return "O motor do  " + this.modelo + " foi desligado agora";
        }
        
        // quando o carro esta em movimento
        return "Atencao: O motor do " + this.modelo + " nao foi possivel desligar pois o carro esta em movimento";
    }
    
    public String acelerar(int valor){
        if (this.ligado){
            this.velocidade += valor;
            return this.modelo + " --> Acelerou!! Valocidade Atual: "+ this.velocidade + "Km/h.";
        }
         return this.modelo + " --> Atencao!! Nao e possivel acelerar com o carro desligado";
    }
    
    public String frear (int valor){
        
        // se o motor estiver desligado
        if (!this.ligado){
            return this.modelo + " --> Atencao!! O motor do carro esta desligado! O carro esta parado";
        }
        
        // caso esteja ligado
        //verifica se a velocidade e zero
        if (this.velocidade == 0 ) {
            return this.modelo + " --> Atencao!! O carro ja esta parado";
        }
        
        // verifica se a reducao da velocidade daria negativo
        if ((this.velocidade - valor ) < 0){
            //atribuir zero a velocidade
            this.velocidade = 0;
            
            return this.modelo + " --> Freou!! O carro esta parado";
        }
        
        // caso a fragem aplicada ainda deixe a velocidade positiva 
        this.velocidade -= valor;
        return this.modelo + " --> freou!! a Velocidade atual; "+ this.velocidade + "Km/h.";
    }

    

}

