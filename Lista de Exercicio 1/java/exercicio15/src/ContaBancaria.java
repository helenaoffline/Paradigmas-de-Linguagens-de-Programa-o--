public class ContaBancaria {
    private String Titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.Titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar (double valor) throws SaldoInsuficiente {
        if (valor>getSaldo()){
            throw new SaldoInsuficiente("Saldo insuficiente para realizar saque");
        }else {
            saldo -= valor;
        }
    }

    public void exibirDetalhes(){
        System.out.println("Titular: " + getTitular() + "- Saldo: " + getSaldo());
    }

}
