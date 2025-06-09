import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, menor, maior, i;

        System.out.println("-->EXIBIR TODOS OS NÚMEROS NATURAIS ENTRE OS INSERIDOS<--");
        System.out.print("Digite o primeiro número inteiro: ");
        num1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = in.nextInt();

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        System.out.println("Números naturais entre " + menor + " e " + maior + ":");

        i = menor + 1;

        if (menor + 1 < maior) {  // verifica se existe algum número entre eles
            do {
                if (i >= 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i < maior);
        }
        System.out.println();
    }
}
