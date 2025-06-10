import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--> VERIFICAÇÃO DE PALÍNDROMO <--");
        System.out.print("Digite uma palavra ou frase: ");
        String texto = in.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println(texto + " é um palíndromo.");
        } else {
            System.out.println(texto + " NÃO é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String s) {
        // Remove espaços, pontuações e coloca tudo em minúsculo para ignorar diferenças
        String texto = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return ehPalindromoRec(texto, 0, texto.length() - 1);
    }

    // Função recursiva que verifica se a substring entre inicio e fim é palíndromo
    public static boolean ehPalindromoRec(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true; // caso base: índices se cruzaram ou iguais, é palíndromo
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false; // caracteres diferentes, não é palíndromo
        }

        return ehPalindromoRec(texto, inicio + 1, fim - 1);
    }
}
