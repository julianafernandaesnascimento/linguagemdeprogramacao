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
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
