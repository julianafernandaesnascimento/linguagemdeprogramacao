import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, expoente;

        Scanner in = new Scanner(System.in);

        System.out.println("--> CÁLCULO DE POTÊNCIA DO NÚMERO INSERIDO PELO USUÁRIO <--");
        System.out.print("Digite a base (inteiro): ");
        base = in.nextInt();

        System.out.print("Digite o expoente (inteiro maior ou igual a 0): ");
        expoente = in.nextInt();

        if (expoente >= 0) {
            System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));
        } else {
            System.out.println("O expoente deve ser maior ou igual a zero.");
        }
    }

    public static long potencia(int base, int expoente) {
        // caso base: qualquer número elevado a 0 é 1
        if (expoente == 0) {
            return 1;
        }
        // chamada recursiva: base^expoente = base * base^(expoente-1)
        return base * potencia(base, expoente - 1);
    }
}
