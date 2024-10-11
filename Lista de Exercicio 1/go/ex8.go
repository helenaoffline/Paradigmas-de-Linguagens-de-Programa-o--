package main

import "fmt"

type Empresa struct {
	cnpj       string
	nome       string
	empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
	e.empregados = append(e.empregados, empregado)
}

func (e Empresa) ExibirDetalhes() {
	fmt.Printf("Empresa: %s\n", e.nome)
	for _, empregado := range e.empregados {
		fmt.Printf("Empregado: %s\n", empregado.nome)
	}
}

type Empregado struct {
	nome    string
	cargo   string
	salario string
}

func main() {
	empregado1 := Empregado{nome: "João", cargo: "Chef", salario: "1000"}
	empregado2 := Empregado{nome: "Joca", cargo: "Professor", salario: "2000"}
	empresa1 := Empresa{cnpj: "19029093029", nome: "Cacao Show"}

	empresa1.AdicionarEmpregado(empregado1)
	empresa1.AdicionarEmpregado(empregado2)

	empresa1.ExibirDetalhes()
}
