class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

def somar(produto1, produto2):
    soma_total = produto1.preco + produto2.preco
    print(f"Soma dos produtos: {soma_total}")

produto1 = Produto("Notebook", 3500)
produto2 = Produto("Mouse", 100)

somar(produto1, produto2)