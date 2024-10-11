import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Empregado> empregagos;

    public Empresa(String nome){
        this.nome = nome;
        this.empregagos = new ArrayList<>();
    }

    public void adicionarEmpregago(Empregado empregago){
        empregagos.add(empregago);
    }

    public void exibirDetalhes(){
        for (Empregado empregago : empregagos){
            System.out.println("Nome: " + empregago.getNome() + " Cargo: " + empregago.getCargo() + " Salario: " + empregago.getSalario());
        }
    }

}
