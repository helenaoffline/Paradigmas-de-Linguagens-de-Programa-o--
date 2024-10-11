//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("Sorte");
        Empregado empregado1 = new Empregado("Sorte", "sortudo", 90.90);

        empresa1.adicionarEmpregago(empregado1);
        empresa1.exibirDetalhes();

    }
}