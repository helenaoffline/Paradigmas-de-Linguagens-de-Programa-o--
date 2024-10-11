package main.java.org.example;

public class Retangulo {
    private double comprimento;
    private double largura;

    // Construtor
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Metodo para calcular a Area
    public double calcularArea() {
        return comprimento * largura;
    }

    // Metodo para calcular o perimetro
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }


}
