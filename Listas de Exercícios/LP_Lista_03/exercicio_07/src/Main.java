import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("-->RESOLVE UMA EQUAÇÃO DO SEGUNDO GRAU<--");
        System.out.println("Digite o coeficiente A: ");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente C: ");
        c = in.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x1 = " + String.format("%.2f", x1));
            System.out.println("x2 = " + String.format("%.2f", x2));
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("A equação possui uma raiz real:");
            System.out.println("x = " + String.format("%.2f", x1));
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
