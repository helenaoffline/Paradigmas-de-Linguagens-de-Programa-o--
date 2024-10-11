//# FaÃ§a um programa em Python que receba 6 numeros inteiros e mostre: Â´
//#  â€¢ Os numeros pares digitados;
//#  â€¢ A soma dos numeros pares digitados;
//#  â€¢ Os numeros   Ä±mpares digitados;
//#  â€¢ A quantidade de numeros  Ä±mpares

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int countOdd = 0;

        System.out.println("Digite 6 nÃºmeros inteiros:");

        // Receber os nÃºmeros do usuÃ¡rio
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        Operacoes.numerosPares(numbers);

        Operacoes.numerosImpares(numbers);

    }
}
