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
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
