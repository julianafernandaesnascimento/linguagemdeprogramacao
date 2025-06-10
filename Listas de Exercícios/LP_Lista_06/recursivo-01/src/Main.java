import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("--> SOMA DE TODOS OS NÚMEROS INTEIROS DE 1 ATÉ O INSERIDO PELO USUÁRIO <--");
        System.out.println("Digite um número: ");
        number = in.nextInt();

        if (number > 0) {
            System.out.println("Soma de 1 até " + number + " = " + somaAteN(number));
        } else {
            System.out.println("Por favor, insira um número inteiro positivo maior que zero.");
        }
    }

    public static int somaAteN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + somaAteN(n - 1); // chama a função para n-1 e soma com n
    }
}
