import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("-->VERIFICA SE É UM TRIÂNGULO E QUAL O SEU TIPO<--");
        System.out.println("Digite o primeiro lado: ");
        a = in.nextDouble();

        System.out.println("Digite o segundo lado: ");
        b = in.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        c = in.nextDouble();

        if ((a < b + c && a > Math.abs(b - c)) &&
                (b < a + c && b > Math.abs(a - c)) &&
                (c < a + b && c > Math.abs(a - b))) {

            if (a == b && b == c) {
                System.out.println("É um triangulo equilatero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("É um triangulo isoceles..");
            } else {
                System.out.println("É um triangulo escaleno.");
            }
        } else {
            System.out.println("A medida informada não forma um triângulo");
        }
    }
}
