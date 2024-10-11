public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public  double getPreco(){
        return preco;
    }
    public void exibirDetalhes(){
        System.out.println("Produto: " + getNome() + "-" + getPreco() );
    }

    public static double somarProdutos( Produto produto1, Produto produto2){
        return produto1.getPreco() + produto2.getPreco();
    }

}
