public class Recursao {

    // 1. Multiplicação de dois números naturais, através de somas sucessivas
    public static int multiplicacao(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicacao(a, b - 1);
    }

    // 2. Soma de dois números naturais, através de incrementos sucessivos
    public static int soma(int a, int b) {
        if (b == 0) return a;
        return soma(a + 1, b - 1);
    }

    // 3. Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
    public static double somaHarmonica(int n) {
        if (n == 1) return 1.0;
        return 1.0 / n + somaHarmonica(n - 1);
    }

    // 4. Inversão de uma string
    public static String inverterString(String s) {
        if (s.isEmpty()) return s;
        return inverterString(s.substring(1)) + s.charAt(0);
    }

    // 5. Gerador da sequência dada por F(1) = 1, F(2) = 2, F(n) = 2 * F(n-1) + 3 * F(n-2)
    public static int sequenciaF(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return 2 * sequenciaF(n - 1) + 3 * sequenciaF(n - 2);
    }

    // 6. Gerador de Sequência de Ackerman
    public static int ackerman(int m, int n) {
        if (m == 0) return n + 1;
        if (m != 0 && n == 0) return ackerman(m - 1, 1);
        return ackerman(m - 1, ackerman(m, n - 1));
    }

    // 7. Soma e produto dos elementos de um vetor de números inteiros
    public static int somaVetor(int[] vetor, int n) {
        if (n <= 0) return 0;
        return vetor[n - 1] + somaVetor(vetor, n - 1);
    }

    public static int produtoVetor(int[] vetor, int n) {
        if (n <= 0) return 1;
        return vetor[n - 1] * produtoVetor(vetor, n - 1);
    }

    // 8. Verificar se uma palavra é palíndromo
    public static boolean isPalindromo(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindromo(s.substring(1, s.length() - 1));
    }

    // 9. Gerar todas as possíveis combinações com as n primeiras letras do alfabeto
    public static void permutacoes(String prefixo, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefixo);
        else {
            for (int i = 0; i < n; i++)
                permutacoes(prefixo + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    // 10. Sequência de Fibonacci generalizada
    public static int fibg(int f0, int f1, int n) {
        if (n == 0) return f0;
        if (n == 1) return f1;
        return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
    }

    public static void main(String[] args) {
        // Testes dos métodos
        System.out.println("Multiplicação: " + multiplicacao(6, 4));
        System.out.println("Soma: " + soma(3, 2));
        System.out.println("Soma Harmônica: " + somaHarmonica(4));
        System.out.println("Inversão de String: " + inverterString("abcde"));
        System.out.println("Sequência F: " + sequenciaF(5));
        System.out.println("Ackerman: " + ackerman(2, 3));
        int[] vetor = {1, 2, 3, 4};
        System.out.println("Soma do Vetor: " + somaVetor(vetor, vetor.length));
        System.out.println("Produto do Vetor: " + produtoVetor(vetor, vetor.length));
        System.out.println("Palíndromo: " + isPalindromo("abcba"));
        System.out.println("Permutações:");
        permutacoes("", "ABC");
        System.out.println("Fibonacci Generalizada: " + fibg(0, 1, 5));
    }
}