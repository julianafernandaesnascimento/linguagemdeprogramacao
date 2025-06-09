import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("-->TABUADA DE UM NÚMERO<--");
        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        System.out.println("----------------------------");
        System.out.println("Tabuada de " + numero + " (usando for)");
        System.out.println("----------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
