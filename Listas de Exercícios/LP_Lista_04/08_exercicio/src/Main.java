import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-->DENOMINA SE O NÚMERO INSERIDO É PRIMO OU NÃO<--");
        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false; // números <= 1 não são primos, portanto aqui estão sendo descartados
        }

        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}
