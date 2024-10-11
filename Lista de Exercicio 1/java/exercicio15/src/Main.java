public class Main {
    public static void main(String[] args) throws SaldoInsuficiente {
        ContaBancaria conta = new ContaBancaria("Helena", 500);

        conta.exibirDetalhes();

        conta.sacar(20);

        conta.exibirDetalhes();

        conta.sacar(600);
    }
}