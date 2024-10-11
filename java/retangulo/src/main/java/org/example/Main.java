package org.example;

import main.java.org.example.Retangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando uma instÃ¢ncia da classe Retangulo
        Retangulo ret = new Retangulo(200, 300);
        System.out.println("Area: " + ret.calcularArea());
        System.out.println("Perimetro: " + ret.calcularPerimetro());
    }
}
