//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(2000.20, "Nego ney");
        contaBancaria1.sacar(0.20);
        contaBancaria1.exibirDetalhes();
        contaBancaria1.depositar(2000.20);
        contaBancaria1.exibirDetalhes();
    }
}