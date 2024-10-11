//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Camiseta", 100.0);
        Produto prod2 = new Produto("Calça", 150.0);

        prod1.exibirDetalhes();
        prod2.exibirDetalhes();

        double precoTotal = Produto.somarProdutos(prod1, prod2);
        System.out.println("Preço total: " + precoTotal);
    }
}