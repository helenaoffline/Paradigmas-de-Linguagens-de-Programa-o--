//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro("Cachorro", "Bob");
        bob.emitir_som();
        bob.amamentar();

        Morcego billy = new Morcego("Morcego", "billy");
        billy.emitir_som();
        billy.amamentar();
        billy.voar();

        Gato ripley = new Gato("Felino", "ripley");
        ripley.emitir_som();

        }
    }