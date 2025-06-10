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
        long resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
