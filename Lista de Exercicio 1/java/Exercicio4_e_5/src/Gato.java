public class Gato extends Animal{
        public Gato(String nome){
            super(nome);
        }
        @Override
        public void som(){
            System.out.println(getNome() + " Miau Miau");
        }

}
