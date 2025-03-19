package  exe1;

import org.w3c.dom.ls.LSOutput;

public class Cliente {

    private String numConta, numAgencia, nome;
    private float saldo;

    public Cliente() {

    }

    public Cliente(String numConta, String numAgencia, String nome, float saldo) {
        this.setNumConta(numConta);
        this.setNumAgencia(numAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        //metodo de instancia que trabalha o objeto
        if (numConta.length() == 8) {
            if(numConta.charAt(6) == '-'){
                this.numConta = numConta;
            } else{
            System.out.println("Problema do DV na conta");
            this.numConta = "11111-1";
            }
        }
        else{
            System.out.println("Problema no tamanho da conta");
        }
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if (numAgencia.length() == 6) {
            if(numAgencia.charAt(4) == '-'){
                this.numAgencia = numAgencia;
            } else{
                System.out.println("Problema do DV na agencia");
                this.numAgencia = "1111-1";
            }
        }
        else{
            System.out.println("Problema no tamanho da agencia");
        }
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0){
            System.out.println("Saldo insuficiente");
        }
        else {
            this.saldo = saldo;
        }
    }

    public void realizarDeposito(float x){
        this.setSaldo(this.getSaldo() + x);
    }



}
