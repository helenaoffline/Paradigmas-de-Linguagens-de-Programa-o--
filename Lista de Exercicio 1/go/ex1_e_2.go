package main

import "fmt"

type Carro struct {
	Marca     string
	Modelo    string
	Ano       string
	Velocidade int
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %s\n", c.Marca, c.Modelo, c.Ano)
}

func (c *Carro) Acelerar() {
	c.Velocidade += 5
}

func (c *Carro) Frear() {
	c.Velocidade -= 5
}

func (c Carro) ExibirVelocidade() {
	fmt.Printf("A velocidade atual do %s-%s é %d km/h\n", c.Modelo, c.Ano, c.Velocidade)
}

func main() {
	carro1 := Carro{Marca: "Nissan", Modelo: "Kicks", Ano: "2018", Velocidade: 0}
	carro2 := Carro{Marca: "Nissan", Modelo: "Kicks", Ano: "2019", Velocidade: 10}

	carro1.ExibirDetalhes()
	carro2.ExibirDetalhes()

	carro2.Acelerar()

	carro2.ExibirVelocidade()
}
