import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-->CALCULADORA GEOMÉTRICA<--");
        System.out.println("""
------------------------------
Menu:
    1 - Círculo
    2 - Triângulo Retângulo
    3 - Retângulo
    4 - Sair
------------------------------""");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.print("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();

                double area = Math.PI * Math.pow(raio, 2);
                double perimetro = 2 * Math.PI * raio;

                System.out.println("------------------------------");
                System.out.printf("A área do círculo é= %.2f%n", area);
                System.out.printf("O perímetro do círculo é= %.2f%n", perimetro);
            }

            case 2 -> {
                System.out.print("Informe a base (cateto 1): ");
                double cateto1 = scanner.nextDouble();
                System.out.print("Informe a altura (cateto 2): ");
                double cateto2 = scanner.nextDouble();

                double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
                double area = (cateto1 * cateto2) / 2;
                double perimetro = cateto1 + cateto2 + hipotenusa;

                System.out.println("------------------------------");
                System.out.printf("A área do triângulo retângulo = %.2f%n", area);
                System.out.printf("O perímetro do triângulo retângulo = %.2f%n", perimetro);
            }

            case 3 -> {
                System.out.print("Informe a base: ");
                double base = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();

                double area = base * altura;
                double perimetro = 2 * (base + altura);

                System.out.println("------------------------------");
                System.out.printf("A área do retângulo = %.2f%n", area);
                System.out.printf("O perímetro do retângulo = %.2f%n", perimetro);
            }

            case 4 -> {
                System.out.println("Encerrando a calculadora...");
            }

            default -> {
                System.out.println("Opção inválida!");
            }
        }
    }
}
