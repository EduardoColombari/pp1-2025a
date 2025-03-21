package exe2;

public class Aluno {

    private String nome, numAluno;
    private int idade;
    private float p1,p2;

    public Aluno() {
        this.nome = "sem nome";
    }

    public Aluno(String nome, String numAluno, int idade, float p1, float p2) {
        this.setNome(nome);
        this.setNumAluno(numAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("Não pode ultrapassar mais de 30 caracteres");
            this.nome = "sem nome";
        }
    }

    public String getNumAluno() {
        return numAluno;
    }

    public void setNumAluno(String numAluno) {
        if (numAluno.length() == 6) {
            this.numAluno = numAluno;
        }
        else{
            System.out.println("Tamanho está invalido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
        else {
            System.out.println("Idade não pode ser negativo");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 > 0) {
            this.p1 = p1;
        }
        else {
            System.out.println("A nota não pode ser negativo");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 > 0) {
            this.p2 = p2;
        }
        else {
            System.out.println("A nota não pode ser negativo");
        }
    }
    public float notafinal(){
      float media = (p1 + p2) / 2;
      return media;
    }
    public String dadosAluno() {
        return "\nAluno{" +
                " Nome: " + this.nome +
                " Número: " + this.numAluno +
                " P1: " + this.p1 +
                " p2: " + this.p2 +
                "}";
    }

}
