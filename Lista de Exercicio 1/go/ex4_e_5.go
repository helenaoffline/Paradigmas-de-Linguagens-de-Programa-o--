package main

import "fmt"

type Animal interface {
	EmitirSom()
}

type Cachorro struct {
	nome    string
	especie string
}

func (c Cachorro) EmitirSom() {
	fmt.Printf("%s: Auau\n", c.nome)
}

type Gato struct {
	nome    string
	especie string
}

func (g Gato) EmitirSom() {
	fmt.Printf("%s: Miau miau\n", g.nome)
}

func TodosOsAnimais(animais []Animal) {
	for _, animal := range animais {
		animal.EmitirSom()
	}
}

func main() {
	cachorro1 := Cachorro{nome: "Bob", especie: "Cachorro"}
	gato1 := Gato{nome: "Mia", especie: "Gato"}

	cachorro1.EmitirSom()
	gato1.EmitirSom()

	animais := []Animal{cachorro1, gato1}

	TodosOsAnimais(animais)
}
