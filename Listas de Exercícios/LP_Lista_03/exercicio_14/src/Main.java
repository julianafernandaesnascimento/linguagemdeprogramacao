import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra, total;
        int opcao, parcelas;

        System.out.println("-->CALCULAR VALOR FINAL DA COMPRA ATRAVÉS DA FORMA DE PAGAMENTO<--");
        System.out.print("Insira o valor da compra: R$ ");
        valorCompra = scanner.nextDouble();

        System.out.println("""
----------------------------------
Menu:
    1. Débito
    2. Pix
    3. Crédito
----------------------------------""");

        System.out.print("Escolha a forma de pagamento: ");
        opcao = scanner.nextInt();
        System.out.println("----------------------------------");

        switch (opcao) {
            case 1 -> {
                total = valorCompra * 0.95;
                double desconto = valorCompra - total;
                System.out.println("Débito selecionado");
                System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
                System.out.printf("Desconto: R$ %.2f%n", desconto);
                System.out.printf("Valor final da compra: R$ %.2f%n", total);
            }

            case 2 -> {
                total = valorCompra * 0.90;
                double desconto = valorCompra - total;
                System.out.println("Pix selecionado");
                System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
                System.out.printf("Desconto: R$ %.2f%n", desconto);
                System.out.printf("Valor final da compra: R$ %.2f%n", total);
            }

            case 3 -> {
                System.out.print("Escolha o número de parcelas (máx. 10): ");
                parcelas = scanner.nextInt();

                if (parcelas <= 0 || parcelas > 10) {
                    System.out.println("Quantidade de parcelas inválida!");
                    break;
                }

                System.out.println("----------------------------------");
                System.out.println("Crédito selecionado");
                System.out.println("----------------------------------");

                if (parcelas <= 4) {
                    total = valorCompra * 1.02;
                    double taxa = total - valorCompra;
                    System.out.printf("Quantidade de parcelas: %d%n", parcelas);
                    System.out.printf("Taxa: R$ %.2f%n", taxa);
                    System.out.printf("Valor final da compra: R$ %.2f%n", total);
                } else {
                    total = valorCompra * 1.05;
                    double taxa = total - valorCompra;
                    System.out.printf("Quantidade de parcelas: %d%n", parcelas);
                    System.out.printf("Taxa: R$ %.2f%n", taxa);
                    System.out.printf("Valor final da compra: R$ %.2f%n", total);
                }
            }

            default -> System.out.println("Opção inválida!");
        }
    }
}
