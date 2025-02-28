package exe2;

public class Clientes {

    public Integer nroConta,nroAgente;
    public String nome;
    public Float saldo;

    public Clientes() {
        this.nome = "Sem nome";
    }

    public Clientes(Integer nroConta, Integer nroAgente, String nome, Float saldo) {

        this.nroConta = nroConta;
        this.nroAgente = nroAgente;
        this.nome = nome;
        this.saldo = saldo;

    }

    public void realizarDeposito(Float valor){
            this.saldo+=valor;
    }

    public void realizarSaque(Float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saldo realizado com sucesso");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void dadosConta(){
        System.out.println("\nConta: "+this.nroConta
            +"\nNome: "+ this.nome
            +"\nSaldo: "+ this.saldo
        );
    }
}
