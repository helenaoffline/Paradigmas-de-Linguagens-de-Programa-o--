import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
    }

    public String getNome() {
        return nome;
    }

    public void exibirEscolas() {
        for (Escola escola : escolas) {
            System.out.println(escola.getNome());
        }
    }
}
