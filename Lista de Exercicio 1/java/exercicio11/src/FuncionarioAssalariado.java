public class FuncionarioAssalariado extends Funcionario{
    private double salario;

    public FuncionarioAssalariado(String nome, double salario){
        super(nome);
        this.salario = salario;
    }
    @Override
    public double calcularSalario(){
        return salario;
    }

}
