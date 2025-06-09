import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-->EXIBE A SEQUENCIA DE FIBONACCI ATÉ O TERMO DESEJADO<--");
        System.out.print("Digite o número de termos da sequência Fibonacci: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(a);

            if (i < n - 1) {
                System.out.print(", ");
            }

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println();
    }
}
