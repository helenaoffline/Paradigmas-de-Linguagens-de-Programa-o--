class SaldoInsuficienteException(Exception):
    def __init__(self, mensagem):
        self.mensagem = mensagem
        super().__init__(self.mensagem)

class ContaBancaria:
    def __init__(self, saldo, titular):
        self.__saldo = saldo
        self.titular = titular

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
        else:
            print("Valor de depósito deve ser positivo.")

    def sacar(self, valor):
        if valor > 0:
            if valor <= self.__saldo:
                self.__saldo -= valor
            else:
                raise SaldoInsuficienteException("Saldo insuficiente para saque.")
        else:
            print("Valor de saque deve ser positivo.")
    
    def exibir_detalhes(self):
        print(f"Titular: {self.titular} Saldo: R${self.__saldo}")

try:
    contaBancaria_1 = ContaBancaria(200, "Pedro")

    contaBancaria_1.exibir_detalhes()
    contaBancaria_1.depositar(50)
    contaBancaria_1.sacar(20)
    contaBancaria_1.exibir_detalhes()

    contaBancaria_1.sacar(300)
except SaldoInsuficienteException as e:
    print(e)
