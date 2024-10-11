package main

import "fmt"

type Funcionario interface {
	CalcularSalario() float64
}

type FuncionarioHorista struct {
	nome            string
	horasTrabalhadas float64
	valorHora       float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return f.horasTrabalhadas * f.valorHora
}

type FuncionarioAssalariado struct {
	nome          string
	salarioMensal float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.salarioMensal
}

func main() {
	horista := FuncionarioHorista{nome: "João", horasTrabalhadas: 160, valorHora: 25}
	assalariado := FuncionarioAssalariado{nome: "Maria", salarioMensal: 5000}

	fmt.Printf("Salário de %s: R$%.2f\n", horista.nome, horista.CalcularSalario())
	fmt.Printf("Salário de %s: R$%.2f\n", assalariado.nome, assalariado.CalcularSalario())
}
