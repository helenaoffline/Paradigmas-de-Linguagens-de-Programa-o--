class Imprimivel:
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    
    def __init__(self, conteudo):
        self.conteudo = conteudo
    
    def imprimir(self):
        print(f"Imprimindo Relatório: {self.conteudo}")

class Contrato(Imprimivel):
    
    def __init__(self, partes, termos):
        self.partes = partes
        self.termos = termos
    
    def imprimir(self):
        print(f"Imprimindo Contrato entre {self.partes} com os termos: {self.termos}")


relatorio = Relatorio("Relatório Financeiro Anual")
contrato = Contrato("Empresa A e Empresa B", "Termos de confidencialidade")

relatorio.imprimir()
contrato.imprimir()
