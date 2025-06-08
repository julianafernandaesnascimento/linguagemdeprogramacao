import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("--> CALCULA A SOLUÇÃO DE UMA EQUAÇÃO DO 1º GRAU (ax + b = 0) <--");
        System.out.print("Digite o valor do coeficiente angular (a): ");
        a = in.nextDouble();
        System.out.print("Digite o valor do coeficiente linear (b): ");
        b = in.nextDouble();

        x = -b / a;
        System.out.println("A equação é: " + a + "x + " + b + " = 0");
        System.out.println("A solução da equação é: x = " + String.format("%.2f", x));
    }
}
