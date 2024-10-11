package main

import "fmt"

type Produto struct {
	nome  string
	preco float64
}

func Somar(produto1, produto2 Produto) {
	somaTotal := produto1.preco + produto2.preco
	fmt.Printf("Soma dos produtos: %.2f\n", somaTotal)
}

func main() {
	produto1 := Produto{nome: "Notebook", preco: 3500}
	produto2 := Produto{nome: "Mouse", preco: 100}

	Somar(produto1, produto2)
}
