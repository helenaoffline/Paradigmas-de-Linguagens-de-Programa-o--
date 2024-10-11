class Funcionario:
    
    def __init__(self, nome):
        self.nome = nome

    def calcularSalario(self):
        pass

class FuncionarioHorista(Funcionario):
    
    def __init__(self, nome, horas_trabalhadas, valor_hora):
        super().__init__(nome)
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcularSalario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    
    def __init__(self, nome, salario_mensal):
        super().__init__(nome)
        self.salario_mensal = salario_mensal

    def calcularSalario(self):
        return self.salario_mensal

horista = FuncionarioHorista("João", 160, 25)
assalariado = FuncionarioAssalariado("Maria", 5000)

print(f"Salário de {horista.nome}: R${horista.calcularSalario()}")
print(f"Salário de {assalariado.nome}: R${assalariado.calcularSalario()}")
