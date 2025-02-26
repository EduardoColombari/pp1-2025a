package exe0;

import javax.swing.*;

public class Carro {
    public int ano;
    public float velocidade;
    public String marca;
    public String modelo;
    public  String mensagem;

    //metodo contrutor
    public  Carro(int ano, float velocidade, String marca, String modelo){
        this.ano =  ano;
        this.velocidade =  velocidade;
        this.marca = marca;
        this.modelo =  modelo;

    }

    public  Carro(){
        this.marca =  "Vazia";
        this.modelo =  "Vazio";


    }



//    this represnta o objeto que chama o método
    public void exibirDetalhes() {
        if(this.velocidade < 0) {
            JOptionPane.showMessageDialog(null,"A velocidade não pode ficar negativa");
        }
        else{
            JOptionPane.showMessageDialog(null,"\nMarca: " + this.marca
                    + " \nModelo: " + this.modelo
                    + " \nAno: " + this.ano
                    + " \nVelocidade: "  + this.velocidade);
        }
    }

    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    public void frear(float y){
        if(this.velocidade - y >= 0) {
            this.velocidade -= y;
        }
        else{
            JOptionPane.showMessageDialog(null,"A velocidade não pode ficar negativa");
        }

    }

}
