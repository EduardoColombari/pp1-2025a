import exe1.Aluno;

public class MainAluno {

    public static void main(String[] args) {

        //instancia a classe Aluno -> objeto
        Aluno aluno1 = new Aluno(); //chama construtor
        aluno1.notaFinal();
        System.out.println(aluno1.notaFinal());
        aluno1.dadosAluno();

        Aluno aluno2 = new Aluno(1524,"Jade",19,7.0f,10.0f);
        System.out.println(aluno2.notaFinal());
        aluno2.dadosAluno();

    }

}
