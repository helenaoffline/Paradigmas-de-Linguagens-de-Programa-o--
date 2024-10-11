class Animal:
    def __init__(self, especie, nome):
        self.nome = nome
        self.especie = especie

    def emitir_som(self):
        pass


class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__('Cachorro', nome)
    
    def emitir_som(self):
        print(f"{self.nome}: Auau")

class Gato(Animal):
    def __init__(self, nome):
        super().__init__('Gato', nome)
    
    def emitir_som(self):
        print(f"{self.nome}: Miau miau")

def todos_os_animais(self):
    for animal in animais:
        animal.emitir_som()

cachorro_1 = Cachorro("Bob")
cachorro_1.emitir_som()
gato_1 = Gato("Mia")
gato_1.emitir_som()

animais = []
animais.append(cachorro_1)
animais.append(gato_1)

todos_os_animais(animais)