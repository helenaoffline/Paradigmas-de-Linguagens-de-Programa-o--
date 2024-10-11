public class Morcego extends Animal implements Mamifero, Ave {

    public Morcego(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void emitir_som() {
        System.out.println(getNome() + " emiti ruidos noturnos");
    }

    @Override
    public void amamentar() {
        System.out.println(getNome() + " está amamentando");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando");
    }
}
