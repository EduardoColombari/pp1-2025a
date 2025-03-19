package exe0;

public class Carro {
    //private - encapsulamento de variaveis

    private String marca,modelo;
    private int ano;
    private float velocidade;

    public Carro() {
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }

    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    //criar setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(float velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else {
            System.out.println("Velocidade inválido");
        }
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
        else {
            System.out.println("Ano inválido");
        }
    }

    //getters

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public float getVelocidade() {
        return velocidade;
    }


    public String exibeCarro() {
        return "Carro{" +
                "marca: " + this.marca +
                "modelo: " + this.modelo +
                "ano: " + this.modelo +
                "velocidade: " + this.velocidade +
                "}";
    }

    public void acelerar(float x) {
        this.setVelocidade(this.velocidade + x);
        this.vereficaVelMaxima();
    }

    //frear o carro de x
    public void frear(float x) {
        this.setVelocidade(this.velocidade - x);
    }

    private void vereficaVelMaxima() {
        if (this.velocidade > 200) {
            this.velocidade = 200;}
    }


}