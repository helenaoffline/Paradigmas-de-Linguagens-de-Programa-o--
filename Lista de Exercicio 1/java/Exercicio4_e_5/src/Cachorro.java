public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void som(){
        System.out.println(getNome() + " au au");
    }
}
