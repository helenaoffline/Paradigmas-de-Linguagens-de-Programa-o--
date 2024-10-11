class Matematica:
    @staticmethod
    def fatorial(n):
        if n == 0 or n == 1:
            return 1
        else:
            return n * Matematica.fatorial(n - 1)
        

resultado = Matematica.fatorial(5)
print(f"Fatorial de 5: {resultado}")
