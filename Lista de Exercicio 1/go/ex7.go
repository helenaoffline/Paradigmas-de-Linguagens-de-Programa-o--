package main

import "fmt"

type Professor struct {
	nome    string
	escolas []Escola
}

func (p *Professor) AdicionarEscola(escola Escola) {
	p.escolas = append(p.escolas, escola)
}

func (p Professor) ExibirDetalhes() {
	fmt.Printf("Professor: %s\n", p.nome)
	for _, escola := range p.escolas {
		fmt.Printf("Nome: %s\n", escola.nome)
	}
}

type Escola struct {
	nome       string
	professores []Professor
}

func (e *Escola) AdicionarProfessor(professor Professor) {
	e.professores = append(e.professores, professor)
}

func (e Escola) ExibirDetalhes() {
	fmt.Printf("Escola: %s\n", e.nome)
	for _, professor := range e.professores {
		fmt.Printf("Nome: %s\n", professor.nome)
	}
}

func main() {
	professor1 := Professor{nome: "Pedro"}
	escola1 := Escola{nome: "Escola Legal"}
	professor2 := Professor{nome: "Juca"}

	escola1.AdicionarProfessor(professor1)
	escola1.AdicionarProfessor(professor2)
	professor1.AdicionarEscola(escola1)

	escola1.ExibirDetalhes()
	professor1.ExibirDetalhes()
	professor2.ExibirDetalhes()
}
