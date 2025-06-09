import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int resposta, resultado;
        boolean jogoContinua = true;

        System.out.println("-->JOGO DA TABUADA<--");
        // Tabuadas de 1 a 10
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            for (int mult = 0; mult <= 10; mult++) {
                System.out.print(tabuada + " x " + mult + " = ");
                resposta = in.nextInt();
                resultado = tabuada * mult;

                if (resposta != resultado) {
                    System.out.println("Você errou! Fim do jogo.");
                    jogoContinua = false;
                    break; // sai do for interno
                }
            }
            if (!jogoContinua) {
                break; // sai do for externo se errou
            }
        }

        if (jogoContinua) {
            System.out.println("Parabéns! Você completou todas as tabuadas.");
        }

        System.out.println("Obrigado por jogar!");
        in.close();
    }
}
