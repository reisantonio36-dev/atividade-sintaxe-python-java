// Sem "dicionário literal" simples como em Python; aqui usamos duas
// listas paralelas (nomes e precos) para manter o exemplo simples.
// Tipos genéricos como List<String> precisam ser declarados explicitamente.

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Double> precos = new ArrayList<>();

        nomes.add("Arroz");   precos.add(25.90);
        nomes.add("Feijão");  precos.add(8.50);
        nomes.add("Leite");   precos.add(4.75);
        nomes.add("Café");    precos.add(15.30);

        double total = 0;
        System.out.println("===== Resumo da compra =====");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("%-10s R$ %.2f%n", nomes.get(i), precos.get(i));
            total += precos.get(i);
        }

        System.out.println("=============================");
        System.out.printf("%-10s R$ %.2f%n", "TOTAL", total);
    }
}
