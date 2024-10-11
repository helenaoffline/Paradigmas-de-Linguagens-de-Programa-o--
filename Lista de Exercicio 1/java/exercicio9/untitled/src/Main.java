public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio("Relatório Financeiro Anual");
        Contrato contrato = new Contrato("Empresa A e Empresa B", "Termos de confidencialidade");

        relatorio.imprimir();
        contrato.imprimir();
    }
}
