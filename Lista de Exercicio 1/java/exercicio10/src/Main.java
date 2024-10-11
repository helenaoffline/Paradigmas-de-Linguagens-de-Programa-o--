public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(10, 20);
        System.out.println("Soma de 10 e 20: " + resultado1);

        int resultado2 = calculadora.somar(10, 20, 30);
        System.out.println("Soma de 10, 20 e 30: " + resultado2);
    }
}