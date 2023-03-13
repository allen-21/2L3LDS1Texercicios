
package ex2;

/**
 * 
 * 2.	Escreva uma classe em java cujos objetos representam alunos matriculados em uma disciplina.
 * Cada objeto dessa classe deve guardar os seguintes dados do aluno:
 * matrícula, nome, 2 notas de prova e 1 nota de trabalho.
 * Escreva os seguintes métodos para esta classe:
 * calcula a média final do aluno (cada prova tem peso 40% e o trabalho tem peso 20%).
 */
public class Aluno {
    private boolean matricula;
    private String nome;
    private double nota1,nota2, trabalho;

    public Aluno(boolean matricula, String nome, double nota1, double nota2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public Aluno() {
    }
    

    

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
    
    

   
    
    
    public void calcularmedia (){
        
       
              double media;
              media = (this.nota1*0.4)+(this.nota2*0.4)+(this.trabalho*0.2);
        
                System.out.println("A sua media e; " +media);
        
      
    }
    
    
    
}
