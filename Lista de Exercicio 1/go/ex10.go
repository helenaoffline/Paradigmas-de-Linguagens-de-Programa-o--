package main

import "fmt"

func Somar(a, b int) int {
	return a + b
}

func SomarComTres(a, b, c int) int {
	return a + b + c
}

func main() {
	resultado1 := Somar(10, 20)
	resultado2 := SomarComTres(10, 20, 30)

	fmt.Printf("Soma de dois números: %d\n", resultado1)
	fmt.Printf("Soma de três números: %d\n", resultado2)
}
