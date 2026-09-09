// Strings não são percorridas diretamente; usa-se charAt(i) com índice.
// Precisa declarar o tipo de cada variável (String, int).
// (Sem usar StringBuilder.reverse(), que seria um atalho pronto.)

import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        String invertido = "";
        for (int i = 0; i < texto.length(); i++) {
            invertido = texto.charAt(i) + invertido;
        }

        System.out.println("Texto invertido: " + invertido);

        scanner.close();
    }
}
