import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarEscola(Professor professor) {
        professores.add(professor);
    }

    public String getNome() {
        return nome;
    }

    public void exibirProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }
}

