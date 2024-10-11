# Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado.
# Cada empregado deve ter atributos como nome, cargo, e salario

class Empresa:
    def __init__(self, cnpj, nome):
        self.nome = nome
        self.cnpj = cnpj
        self.empregados = []
    
    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)
    
    def exibir_detalhes(self):
        print(f"Empresa: {self.nome}")
        for empregado in self.empregados:
            print(f"Empregado: {empregado.nome}")

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

empregado_1 = Empregado("João", "Chef", "1000")
empregado_2 = Empregado("Joca", "Professor", "2000")
empresa_1 = Empresa("19029093029", "Cacao show")
empresa_1.adicionar_empregado(empregado_1)
empresa_1.adicionar_empregado(empregado_2)
empresa_1.exibir_detalhes()
        