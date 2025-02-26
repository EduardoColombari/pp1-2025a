package exe1;

public class Aluno {

    public Integer nroAluno, idade;
    public String nome;
    public float p1, p2;

    public Aluno(){

        this.nome = "Sem nome";

    }

    public Aluno(Integer nroAluno, String nome, Integer idade, float p1, float p2){

        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;

    }

    public float notaFinal(){

        return (this.p1 + this.p2) / 2;

    }

    public String passou(){
       return (this.notaFinal() >= 6.0f) ? "Passou" : "Não passou";
    }

    public void dadosAluno(){
        System.out.println("\nNome: " + this.nome
                + "\nNro. Aluno: " + this.nroAluno
                + "\nIdade: " + this.idade
                + "\nNota 1: " + this.p1
                + "\nNota 2: " + this.p2
                + "\nSituação: " + this.passou());
    }
}
