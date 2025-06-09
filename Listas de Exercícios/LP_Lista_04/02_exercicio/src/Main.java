import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior, menor, num;

        System.out.println("-->DETERMINA QUAL O MAIOR NÚMEROS DOS INSERIDOS<--");
        System.out.println("Digite 5 números inteiros separados por espaço:");
        num = in.nextInt();

        maior = num;
        menor = num;

        for (int i = 1; i < 5; i++) {
            num = in.nextInt();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
