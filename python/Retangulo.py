class Retangulo:

    def __init__(self, comprimento, largura):
        self.comprimento = comprimento
        self.largura = largura

    def calcular_area(self):
        return self.comprimento * self.largura

    def calcular_perimetro(self):
        return 2 * (self.comprimento + self.largura)

    def exibir_informacoes(self):
        area = self.calcular_area()  # Correção para chamar o método da própria classe
        perimetro = self.calcular_perimetro()  # Correção para chamar o método da própria classe

        print(f"Área: {area}")
        print(f"Perímetro: {perimetro}")

    