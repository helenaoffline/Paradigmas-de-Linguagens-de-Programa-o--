class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.endereco = None

    def adicionar_endereco(self, endereco):
        self.endereco = endereco

    def mostrar_informacoes(self):
        print(f"Nome: {self.nome}, Idade: {self.idade}")
        if self.endereco:
            self.endereco.mostrar_endereco()  # Corrige para chamar o método corretamente
        else:
            print("Endereço indisponível")

class Endereco:
    def __init__(self, rua, cidade, estado, cep):
        self.rua = rua
        self.cidade = cidade
        self.estado = estado
        self.cep = cep

    def mostrar_endereco(self):
        print(f"Rua: {self.rua}, Cidade: {self.cidade}, Estado: {self.estado}, Cep: {self.cep}")

class Empresa:
    def __init__(self, nome, cnpj):
        self.nome = nome
        self.cnpj = cnpj
        self.funcionarios = []

    def contratar_funcionario(self, funcionario):
        self.funcionarios.append(funcionario)

    def listar_funcionarios(self):
        print(f"Funcionários da empresa: {self.nome}")
        for funcionario in self.funcionarios:
            funcionario.mostrar_informacoes()

endereco1 = Endereco("Av. rua 1", "Cidade A", "Estado A", "12345-678")
pessoa1 = Pessoa("João", 69)
pessoa1.adicionar_endereco(endereco1)

endereco2 = Endereco("Av. rua 2", "Cidade B", "Estado B", "98765-432")
pessoa2 = Pessoa("Maria", 69)
pessoa2.adicionar_endereco(endereco2)

empresa = Empresa("Empresa AbC", "1839847398693486498498")
empresa.contratar_funcionario(pessoa1)
empresa.contratar_funcionario(pessoa2)

empresa.listar_funcionarios()
