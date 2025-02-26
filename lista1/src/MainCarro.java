import exe0.Carro;


public class MainCarro {

    public static void main(String[] args) {

        Carro obj1 = new Carro(2015, 30.0F , "Chevrolet","Onix");
        obj1.exibirDetalhes();
        obj1.acelerar(60.0F);
        obj1.frear(100);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro();
        obj2.ano = 2018;
        obj2.velocidade = 0.0F;
        obj2.marca = "Volks";
        obj2.modelo = "Gol";
        obj2.exibirDetalhes();
        obj2.acelerar(50.0F);
        obj2.exibirDetalhes();

        Carro obj3 = new  Carro();
        obj3.exibirDetalhes();


    }
}
