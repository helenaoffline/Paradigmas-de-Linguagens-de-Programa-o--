class Calculadora:
    
    def somar(self, a, b, c=None):
        if c is not None:
            d = a + b + c
        else:
            d = a + b
        print(f"Soma de dois números: {d}")

calculadora_1 = Calculadora()

resultado_1 = calculadora_1.somar(10, 20)
resultado_2 = calculadora_1.somar(10, 20, 30)
