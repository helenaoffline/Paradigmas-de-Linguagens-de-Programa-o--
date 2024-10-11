public class Carro {
//    Adicione um método acelerar e frear à classe Carro que altere um atributo
//    velocidade. Crie um método para exibir a velocidade atual
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, int velocidade, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;


    }

    public int acelerar(){
        return  velocidade+=5;
    }
    public int frear(){
        return  velocidade=5;
    }

    public void exibirVelocidade(){
        System.out.println(" A velocidade do " + modelo + "-" + ano + " é " + velocidade);
    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+ marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Motor: "+ motor.getModelo());
    }

}
