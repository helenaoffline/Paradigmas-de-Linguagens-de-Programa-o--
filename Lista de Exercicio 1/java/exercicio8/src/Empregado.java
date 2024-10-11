/*
. Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado.
Cada empregado deve ter atributos como nome, cargo, e salario
 */
public class Empregago {

    private String nome;
    private String cargo;
    private double salario;

    public Empregago(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
