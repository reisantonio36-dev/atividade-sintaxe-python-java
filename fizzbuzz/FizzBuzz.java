// Diferenças de sintaxe em relação ao Python:
// - Precisa de uma classe pública e de um método main(String[] args).
// - Blocos delimitados por chaves { }, não por indentação.
// - Toda instrução termina com ponto-e-vírgula ;
// - A variável do "for" é declarada, comparada e incrementada explicitamente.

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
