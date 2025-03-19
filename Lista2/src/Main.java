import exe0.Carro;
import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setMarca("Volkswagen");
        carro1.setModelo("Nivus");
        carro1.setVelocidade(-90);
        carro1.setAno(-2024);

        // objeto usando parâmetros
        Carro carro2 = new Carro("Ford","Mustang",2021,0);

       // System.out.println(carro1.toString());
        System.out.println(carro1.exibeCarro());
        System.out.println(carro2.exibeCarro());

        carro2.acelerar(100);
        carro2.acelerar(150);
        carro2.frear(80);
        System.out.println(carro2.exibeCarro());



    }
}