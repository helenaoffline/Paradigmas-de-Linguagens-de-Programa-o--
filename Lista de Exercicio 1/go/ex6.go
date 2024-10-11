package main

import "fmt"

type Motor struct {
	tipoCombustivel string
}

type Carro struct {
	marca         string
	modelo        string
	ano           string
	motor         Motor
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %s, Motor: %s\n", c.marca, c.modelo, c.ano, c.motor.tipoCombustivel)
}

func main() {
	motor1 := Motor{tipoCombustivel: "Gás"}
	carro1 := Carro{marca: "Nissan", modelo: "Kicks", ano: "2018", motor: motor1}

	carro1.ExibirDetalhes()
}
