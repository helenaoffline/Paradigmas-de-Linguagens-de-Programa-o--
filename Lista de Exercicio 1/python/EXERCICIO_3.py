class ContaBancaria:
    def __init__(self, saldo, titular):
        self.__saldo = saldo
        self.titular = titular

    def depositar(self):
        self.__saldo += 10

    def sacar(self):
        self.__saldo -= 20
    
    def exibir_detalhes(self):
        print(f"Titular: {self.titular} Saldo: R${self.__saldo}")

contaBancaria_1 = ContaBancaria(200, "Pedro")

contaBancaria_1.exibir_detalhes()
contaBancaria_1.depositar()
contaBancaria_1.sacar()
contaBancaria_1.exibir_detalhes()