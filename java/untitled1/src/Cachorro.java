public class Cachorro extends Animal implements Mamifero {

    public Cachorro(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void emitir_som() {
        System.out.println(getNome() + " diz: Au au");
    }

    @Override
    public void amamentar() {
        System.out.println(getNome() + " está amamentando");
    }
}
