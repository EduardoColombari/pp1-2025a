import exe1.Cliente;

public class TesteCliente {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Cliente cliente2 = new Cliente("26546-4","0123-4","Eduardo",250);

        cliente.setNumConta("623214-8");
        cliente.setNumAgencia("5445-9");
        cliente.setNome("Julia");
        cliente.setSaldo(4521);

        System.out.println(cliente.exibeConta());
        System.out.println(cliente2.exibeConta());
        cliente2.realizarDeposito(482);
        System.out.println(cliente2.exibeConta());
        cliente2.realizarSaque(1000);
        System.out.println(cliente2.exibeConta());
        cliente2.realizarSaque(254);
        System.out.println(cliente2.exibeConta());

        System.out.println(cliente.getNome());
        System.out.println(cliente.getNumConta());
        System.out.println(cliente.getNumAgencia());
        System.out.println(cliente.getSaldo());


    }
}
