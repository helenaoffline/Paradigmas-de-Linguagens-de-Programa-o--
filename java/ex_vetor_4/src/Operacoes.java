public class Operacoes {

    public  static void numerosPares(int vetor[]){
        int sumEven = 0;
        System.out.print("NÃºmeros pares digitados: ");
        for (int i = 0; i<vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                sumEven += vetor[i];
            }
        }
        System.out.println();

        System.out.println("Soma dos nÃºmeros pares: " + sumEven);
    }

    public static void numerosImpares(int vetor[]){
        int countOdd = 0;
        System.out.print("Números Impares digitados: ");
        for (int i = 0; i<vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
                countOdd++;
            }
        }
        System.out.println();

        System.out.println("Quantidade de nÃºmeros Ã­mpares: " + countOdd);
    }

}
