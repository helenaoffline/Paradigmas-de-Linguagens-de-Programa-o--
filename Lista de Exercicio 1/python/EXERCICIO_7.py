class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []
    
    def adicionar_escola(self, escola):
        self.escolas.append(escola)

    def exibir_detalhes(self):
        print(f"Professor: {self.nome}")
        for escola in self.escolas:
            print(f"Nome: {escola.nome}")


class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []
    
    def adicionar_professor(self, professor):
        self.professores.append(professor)

    def exibir_detalhes(self):
        print(f"Escola: {self.nome}")
        for professor in self.professores:
            print(f"Nome: {professor.nome}")

professor_1 = Professor("Pedro")
escola_1 = Escola("Escola Legal")
professor_2 = Professor("Juca")


escola_1.adicionar_professor(professor_1)
escola_1.adicionar_professor(professor_2)
professor_1.adicionar_escola(escola_1)

escola_1.exibir_detalhes()
professor_1.exibir_detalhes()
professor_2.exibir_detalhes()