package main

import "fmt"

type ContaBancaria struct {
	saldo   float64
	titular string
}

func (c *ContaBancaria) Depositar() {
	c.saldo += 10
}

func (c *ContaBancaria) Sacar() {
	c.saldo -= 20
}

func (c ContaBancaria) ExibirDetalhes() {
	fmt.Printf("Titular: %s Saldo: R$%.2f\n", c.titular, c.saldo)
}

func main() {
	contaBancaria1 := ContaBancaria{saldo: 200, titular: "Pedro"}

	contaBancaria1.ExibirDetalhes()
	contaBancaria1.Depositar()
	contaBancaria1.Sacar()
	contaBancaria1.ExibirDetalhes()
}
