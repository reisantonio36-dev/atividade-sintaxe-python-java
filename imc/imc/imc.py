# input() retorna string; usamos float() para converter.
# Não é preciso declarar o tipo da variável (tipagem dinâmica).
# f-strings facilitam formatar números dentro do texto.

peso = float(input("Digite seu peso (kg): "))
altura = float(input("Digite sua altura (m): "))

imc = peso / (altura ** 2)

if imc < 18.5:
    classificacao = "Abaixo do peso"
elif imc < 25:
    classificacao = "Peso normal"
elif imc < 30:
    classificacao = "Sobrepeso"
elif imc < 35:
    classificacao = "Obesidade grau I"
elif imc < 40:
    classificacao = "Obesidade grau II"
else:
    classificacao = "Obesidade grau III"

print(f"Seu IMC é {imc:.2f} - {classificacao}")
