import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("--> CÁLCULO DO FATORIAL DO NÚMERO DIGITADO PELO USUÁRIO <--");
        System.out.println("Digite um número inteiro positivo: ");
        number = in.nextInt();

        if (number >= 0) {
            System.out.println(number + "! = " + fatorial(number));
        } else {
            System.out.println("Por favor, insira um número inteiro positivo (0 ou maior).");
        }
    }

    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // caso base: fatorial de 0 ou 1 é 1
        }
        return n * fatorial(n - 1); // chamada recursiva
    }
}
