public class ContaBancaria {
//    Implemente uma classe ContaBancaria com atributos saldo, titular e
//    métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo

    private double saldo;
    private  String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double depositar(double valor){
        return saldo+=valor;
    }
    public double sacar(double valor){
        return saldo-=valor;
    }

    public void exibirDetalhes(){
        System.out.println("Titular: " + getTitular() + ", Saldo: " + getSaldo());
    }
}
