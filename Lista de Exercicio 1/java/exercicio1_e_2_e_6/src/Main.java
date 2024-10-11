//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motor motor1= new Motor("V8");
        Carro carro1 = new Carro("Toyota", "Corolla", 2008,10, motor1);
        Motor motor2= new Motor("V9");
        Carro carro2 = new Carro("Toyota 2", "Corolla 2", 2008,20,motor2);
        Motor motor3= new Motor("V10");
        Carro carro3 = new Carro("Toyota 3", "Corolla 3", 2008,  30, motor3);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();

        carro1.frear();
        carro1.exibirVelocidade();

        carro2.acelerar();
        carro2.exibirVelocidade();
    }
}