import exe2.Clientes;

public class MainClientes {
    public static void main(String[] args) {

        Clientes cliente1 = new Clientes(5624,101,"Sofia",2568.00F);
        cliente1.realizarDeposito(120.00F);
        cliente1.dadosConta();
        cliente1.realizarSaque(1210.00F);
        cliente1.dadosConta();
        Clientes cliente2 = new Clientes(4561,99,"Eduardo",1202.00F);
        cliente2.realizarDeposito(590.00F);
        cliente2.dadosConta();
        cliente2.realizarSaque(1300.00F);
        cliente2.dadosConta();
        Clientes cliente3 = new Clientes(3596,112,"Priscila",4563.00F);
        cliente3.realizarSaque(3512.00F);
        cliente3.dadosConta();
        cliente3.realizarDeposito(890.00F);
        cliente3.dadosConta();
    }
}
