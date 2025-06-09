import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, fatorial;

        System.out.println("-->CALCULA O FATORIAL DE UM NÚMERO<--");
        System.out.print("Digite um número: ");
        n = in.nextInt();

        fatorial = 1;

        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);
    }
}
