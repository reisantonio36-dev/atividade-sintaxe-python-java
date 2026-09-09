# Lista de dicionários ({"item": ..., "preco": ...}) — estrutura flexível
# nativa da linguagem, sem precisar criar uma classe.
# f-strings deixam a formatação do resumo bem direta.

itens = [
    {"item": "Arroz", "preco": 25.90},
    {"item": "Feijão", "preco": 8.50},
    {"item": "Leite", "preco": 4.75},
    {"item": "Café", "preco": 15.30},
]

total = 0
print("===== Resumo da compra =====")
for produto in itens:
    print(f"{produto['item']:<10} R$ {produto['preco']:.2f}")
    total += produto["preco"]

print("=============================")
print(f"{'TOTAL':<10} R$ {total:.2f}")
