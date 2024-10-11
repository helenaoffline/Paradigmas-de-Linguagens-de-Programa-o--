import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Helena" );

        ArrayList<Professor> professors = new ArrayList<>();
        Escola escola1 = new Escola("TOP");
        professor1.adicionarEscola(escola1);

        professor1.exibirEscolas();

    }
}