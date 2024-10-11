public class Main {
    public static void main(String[] args) {
        // Cria um vetor de 10 elementos inteiros
        int[] vetor = {5, 12, 7, 20, 15, 8, 3, 11, 6, 9};

        // Calcula a média, o maior valor e o menor valor usando os métodos da classe Operacoes
        int maiorValor = Operacoes.encontrarMaiorValor(vetor);
        int menorValor = Operacoes.encontrarMenorValor(vetor);
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        // Exibe os resultados
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}