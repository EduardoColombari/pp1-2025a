import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio rio = new Rio();
        Rio rio2 = new Rio("Amazonas",57,false);
        rio.exibirDetalhes();
        rio2.exibirDetalhes();
        rio2.poluir();
        rio2.limpar();
        rio2.chover(34);
        rio.ensolarar(12);
        rio2.exibirDetalhes();
    }
}
