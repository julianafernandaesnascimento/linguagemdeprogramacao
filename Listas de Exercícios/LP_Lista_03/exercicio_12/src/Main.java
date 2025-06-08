import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1, n2, result = 0;
        int opcao;

        System.out.println("-->MINICALCULADORA<--");
        System.out.print("Digite o primeiro número: ");
        n1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = in.nextDouble();

        System.out.println(
                "------------------------------\n" +
                        "Menu:\n" +
                        "    1 - Soma\n" +
                        "    2 - Subtração\n" +
                        "    3 - Multiplicação\n" +
                        "    4 - Divisão\n" +
                        "    5 - Sair\n" +
                        "------------------------------"
        );

        System.out.print("Escolha uma opção: ");
        opcao = in.nextInt();

        String operacao = "";

        switch (opcao) {
            case 1:
                result = n1 + n2;
                operacao = "+";
                break;
            case 2:
                result = n1 - n2;
                operacao = "-";
                break;
            case 3:
                result = n1 * n2;
                operacao = "x";
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                result = n1 / n2;
                operacao = "÷";
                break;
            case 5:
                System.out.println("Encerrando...");
                return;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("------------------------------");
        System.out.println("Resultado: " + n1 + " " + operacao + " " + n2 + " = " + String.format("%.2f", result));
    }
}
