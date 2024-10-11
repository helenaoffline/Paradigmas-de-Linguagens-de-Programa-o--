package main

import "fmt"

type Matematica struct{}

func (Matematica) Fatorial(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	return n * Matematica{}.Fatorial(n - 1)
}

func main() {
	m := Matematica{}
	resultado := m.Fatorial(5)
	fmt.Printf("Fatorial de 5: %d\n", resultado)
}
