import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int minor = Integer.MAX_VALUE, major = Integer.MIN_VALUE;
        int minorIndex = 0, majorIndex = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--> IDENTIFICAÇÃO DO MAIOR E MENOR VALOR EM UM VETOR <--");
        System.out.println("Digite 10 números inteiros separados por espaço: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > major) {
                major = array[i];
                majorIndex = i;
            }
            if (array[i] < minor) {
                minor = array[i];
                minorIndex = i;
            }
        }

        System.out.println("Maior valor = " + major + " Posição = " + majorIndex);
        System.out.println("Menor valor = " + minor + " Posição = " + minorIndex);

        scanner.close(); // Boa prática: fechar o Scanner
    }
}