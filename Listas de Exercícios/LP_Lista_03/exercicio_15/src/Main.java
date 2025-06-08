import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dinheiro, troco;
        int opcao;

        System.out.println("-->MÁQUINA DE CAFÉ<--");
        System.out.print("Insira o dinheiro: R$ ");
        dinheiro = scanner.nextDouble();

        System.out.println("""
----------------------------------
Menu:
    1. Café Expresso     R$ 0,50
    2. Café Longo        R$ 1,00
    3. Capuccino         R$ 2,50
    4. Chocolate         R$ 2,00
----------------------------------""");

        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        System.out.println("----------------------------------");

        switch (opcao) {
            case 1 -> {
                if (dinheiro >= 0.50) {
                    troco = dinheiro - 0.50;
                    System.out.println("Bebida selecionada: Café Expresso");
                    System.out.printf("Seu Troco: R$ %.2f%n", troco);
                } else {
                    System.out.println("Saldo insuficiente para Café Expresso.");
                }
            }

            case 2 -> {
                if (dinheiro >= 1.00) {
                    troco = dinheiro - 1.00;
                    System.out.println("Bebida selecionada: Café Longo");
                    System.out.printf("Seu Troco: R$ %.2f%n", troco);
                } else {
                    System.out.println("Saldo insuficiente para Café Longo.");
                }
            }

            case 3 -> {
                if (dinheiro >= 2.50) {
                    troco = dinheiro - 2.50;
                    System.out.println("Bebida selecionada: Capuccino");
                    System.out.printf("Seu Troco: R$ %.2f%n", troco);
                } else {
                    System.out.println("Saldo insuficiente para Capuccino.");
                }
            }

            case 4 -> {
                if (dinheiro >= 2.00) {
                    troco = dinheiro - 2.00;
                    System.out.println("Bebida selecionada: Chocolate");
                    System.out.printf("Seu Troco: R$ %.2f%n", troco);
                } else {
                    System.out.println("Saldo insuficiente para Chocolate.");
                }
            }

            default -> {
                System.out.println("Opção inválida!");
            }
        }
    }
}
