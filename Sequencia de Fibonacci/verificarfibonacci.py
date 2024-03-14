def verifica_fibonacci(numero):
    a, b = 0, 1
    while b < numero:
        a, b = b, a + b
    if b == numero:
        return f"O número {numero} pertence à sequência de Fibonacci."
    else:
        return f"O número {numero} não pertence à sequência de Fibonacci."

# Exemplo de uso:
numero_informado = int(input("Informe um número: "))
print(verifica_fibonacci(numero_informado))