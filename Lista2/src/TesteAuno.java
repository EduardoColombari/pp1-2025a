import exe2.Aluno;

public class TesteAuno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno("Priscila de Silva","562345",17,8,9);
        Aluno aluno3 = new Aluno("João Henrique","475122",15,10,7);

        aluno.setNome("Julia");
        aluno.setNumAluno("054132");
        aluno.setIdade(20);
        aluno.setP1(5);
        aluno.setP2(6);


        System.out.println(aluno2.dadosAluno());
        System.out.println("Nota final: " + aluno2.notafinal());
        System.out.println(aluno3.dadosAluno());
        System.out.println("Nota final: " + aluno3.notafinal());

        System.out.println(aluno.getNome());
        System.out.println(aluno.getNumAluno());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getP1());
        System.out.println(aluno.getP2());
        System.out.println("Nota final: " + aluno.notafinal());

    }
}
