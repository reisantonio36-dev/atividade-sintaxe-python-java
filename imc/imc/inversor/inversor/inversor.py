# Strings são iteráveis diretamente em um "for", sem índice explícito.
# Concatenação com "+", sem precisar de StringBuilder.
# (Sem usar texto[::-1] ou reversed(), que seriam atalhos prontos.)

texto = input("Digite uma palavra ou frase: ")

invertido = ""
for caractere in texto:
    invertido = caractere + invertido

print(f"Texto invertido: {invertido}")
