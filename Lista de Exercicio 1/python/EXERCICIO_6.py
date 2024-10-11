class Carro:
    def __init__(self, marca, modelo, ano, motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = motor
    
    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}, Motor: {self.motor.tipo_combustivel}")

class Motor:
    def __init__(self, tipo_combustivel):
        self.tipo_combustivel = tipo_combustivel

motor_1 = Motor("Gás")
carro_1 = Carro("Nissan","Kicks", "2018", motor_1)

carro_1.exibir_detalhes()