// Faça um programa em Python que receba do usuario 
// um vetor com 10 posições. Em seguida devera ser 
// impresso o maior e o menor elemento do vetor.

package main

import (
	"fmt"
)
func calcularMedia(vetor []int) float64 {
	soma := 0
	for _, valor := range vetor {
		soma += valor
	}
	return float64(soma) / float64(len(vetor))
}

// Função para encontrar o maior valor do vetor
func encontrarMaiorValor(vetor []int) int {
	maiorValor := vetor[0]
	for _, valor := range vetor {
		if valor > maiorValor {
			maiorValor = valor
		}
	}
	return maiorValor
}

// Função para encontrar o menor valor do vetor
func encontrarMenorValor(vetor []int) int {
	menorValor := vetor[0]
	for _, valor := range vetor {
		if valor < menorValor {
			menorValor = valor
		}
	}
	return menorValor
}

func main() {
// Cria um vetor de 10 elementos inteiros
	vetor := []int{5, 12, 7, 20, 15, 8, 3, 11, 6, 9}

	// Calcula a média, o maior valor e o menor valor usando funções
	media := calcularMedia(vetor)
	maiorValor := encontrarMaiorValor(vetor)
	menorValor := encontrarMenorValor(vetor)

	// Exibe os resultados
	fmt.Printf("Média: %.2f\n", media)
	fmt.Printf("Maior valor: %d\n", maiorValor)
	fmt.Printf("Menor valor: %d\n", menorValor)
}
