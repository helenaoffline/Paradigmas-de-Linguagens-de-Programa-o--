class Animal:
    def __init__(self, especie, nome):
        self.nome = nome
        self.especie = especie

    def emitir_som(self):
        pass

class Mamifero(Animal):
    def __init__(self, especie, nome):
        super().__init__(especie, nome)
    
    def amamentar(self):
        print(f"{self.nome} está amamentando")

class Ave(Animal):
    def __init__(self, especie, nome):
        super().__init__(especie, nome)
    
    def voar(self):
        print(f"{self.nome} está voando")

class Morcego(Mamifero, Ave):
    def __init__(self, nome):
        super().__init__('Morcego', nome)
    
    def emitir_som(self):
        print(f"{self.nome} emitindo ruidos noturnos")

class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__('Cachorro', nome)
    
    def emitir_som(self):
        return "Au au"

class Gato(Animal):
    def __init__(self, nome):
        super().__init__('Gato', nome)
    
    def emitir_som(self):
        return "Miau miau"