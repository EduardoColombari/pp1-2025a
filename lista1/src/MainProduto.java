import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        //chama construtor sem paraetro
        Produto produto1 = new Produto();
        Produto produto2 = new Produto(123,5,"Bola de basquete", 500);
        System.out.println(produto1.exibeDetalhes());
        System.out.println(produto2.exibeDetalhes());
        produto2.comprar(3);
        produto2.subir(50);
        produto2.vender(1);
        produto2.vender(30);
        System.out.println(produto2.exibeDetalhes());
    }

}
