import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--> VERIFICAÇÃO DE PALÍNDROMO <--");
        System.out.print("Digite uma palavra ou frase: ");
        String texto = in.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println(texto +  " é um palíndromo.");
        } else {
            System.out.println(texto + " NÃO é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String s) {
        // Remove espaços, pontuações e coloca tudo em minúsculo para ignorar diferenças
        String texto = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}
