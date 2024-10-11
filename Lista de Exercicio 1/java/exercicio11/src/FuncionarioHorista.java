public class FuncionarioHorista extends Funcionario {
    private double horas;
    private double valor;

    public FuncionarioHorista(String nome, double horas, double valor){
        super(nome);
        this.horas = horas;
        this.valor = valor;
    }

    @Override
    public double calcularSalario(){
        return horas * valor;
    }





}