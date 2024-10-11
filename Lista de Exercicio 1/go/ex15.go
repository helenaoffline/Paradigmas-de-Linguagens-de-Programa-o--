package main

import (
	"fmt"
)

type SaldoInsuficienteError struct {
	mensagem string
}

func (e *SaldoInsuficienteError) Error() string {
	return e.mensagem
}

type ContaBancaria struct {
	saldo   float64
	titular string
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
	} else {
		fmt.Println("Valor de depósito deve ser positivo.")
	}
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > 0 {
		if valor <= c.saldo {
			c.saldo -= valor
			return nil
		}
		return &SaldoInsuficienteError{"Saldo insuficiente para saque."}
	}
	return fmt.Errorf("Valor de saque deve ser positivo.")
}

func (c *ContaBancaria) ExibirDetalhes() {
	fmt.Printf("Titular: %s Saldo: R$%.2f\n", c.titular, c.saldo)
}

func main() {
	contaBancaria := ContaBancaria{saldo: 200, titular: "Pedro"}

	contaBancaria.ExibirDetalhes()
	contaBancaria.Depositar(50)
	if err := contaBancaria.Sacar(20); err != nil {
		fmt.Println(err)
	}
	contaBancaria.ExibirDetalhes()

	if err := contaBancaria.Sacar(300); err != nil {
		fmt.Println(err)
	}
}
