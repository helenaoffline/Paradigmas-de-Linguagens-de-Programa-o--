public abstract class Funcionario {
    private String nome;
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public abstract double calcularSalario();
    public String getNome() {
        return nome;
    }
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + " Salário: R$ " + calcularSalario());
    }
}
