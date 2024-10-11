class Carro:
    def __init__(self, marca, modelo, ano, velocidade):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = velocidade
    
    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")

    def acelerar(self):
        self.velocidade += 5

    def frear(self):
        self.velocidade -= 5 
    
    def exibir_velocidade(self):
        print(f" A velocidade atual do {self.modelo}-{self.ano} é {self.velocidade}")


carroa_1 = Carro("Nissan", "Kicks", "2018", 0)
carroa_2 = Carro("Nissan", "Kicks", "2019", 10)
carroa_3 = Carro("Nissan", "Kicks", "2020", 20)

carroa_1.exibir_detalhes()
carroa_2.exibir_detalhes()
carroa_3.exibir_detalhes()

carroa_2.acelerar()
carroa_3.frear()

carroa_2.exibir_velocidade()
carroa_3.exibir_velocidade()
