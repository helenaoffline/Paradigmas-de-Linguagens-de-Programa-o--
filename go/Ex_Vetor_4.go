//# Faça um programa em Python que receba 6 numeros inteiros e mostre: ´
//#  • Os numeros pares digitados;
//#  • A soma dos numeros pares digitados;
//#  • Os numeros   ımpares digitados;
//#  • A quantidade de numeros  ımpares

package main

import (
	"fmt"
)

func numerosPares(vetor []int) {
	sumEven := 0 // Variável para armazenar a soma dos números pares
	fmt.Print("Números pares digitados: ")

	for _, num := range vetor {
		if num%2 == 0 {
			fmt.Print(num, " ")
			sumEven += num
		}
	}
	fmt.Println() // Linha para quebrar após imprimir todos os números pares

	fmt.Println("Soma dos números pares:", sumEven)
}

func numerosImpares(vetor []int) {
	var countOdd int
	fmt.Print("Números ímpares digitados: ")

	for _, num := range vetor {
		if num%2 != 0 {
			fmt.Print(num, " ")
			countOdd++
		}
	}
	fmt.Println()

	fmt.Println("Quantidade de números ímpares:", countOdd)
}

func main() {
	var numbers [6]int

	fmt.Println("Digite 6 números inteiros:")

	// Receber os números do usuário
	for i := 0; i < 6; i++ {
		fmt.Scan(&numbers[i])
	}

	numerosPares(numbers[:])
	numerosImpares(numbers[:])

}
