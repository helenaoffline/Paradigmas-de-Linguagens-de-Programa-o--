//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Paulo", 40 , 2);
        FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("João", 700);

        funcionarioHorista.exibirDetalhes();
        funcionarioAssalariado.exibirDetalhes();
    }
}