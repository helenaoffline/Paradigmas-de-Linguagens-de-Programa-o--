package main

import "fmt"

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct {
	conteudo string
}

func (r Relatorio) Imprimir() {
	fmt.Printf("Imprimindo Relatório: %s\n", r.conteudo)
}

type Contrato struct {
	partes string
	termos string
}

func (c Contrato) Imprimir() {
	fmt.Printf("Imprimindo Contrato entre %s com os termos: %s\n", c.partes, c.termos)
}

func imprimirDocumento(documento Imprimivel) {
	documento.Imprimir()
}

func main() {
	relatorio := Relatorio{conteudo: "Relatório Financeiro Anual"}
	contrato := Contrato{partes: "Empresa A e Empresa B", termos: "Termos de confidencialidade"}

	imprimirDocumento(relatorio)
	imprimirDocumento(contrato)
}
