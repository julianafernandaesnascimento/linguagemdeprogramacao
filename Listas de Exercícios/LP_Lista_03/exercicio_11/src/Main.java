import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        String[] days = {
                "", "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"
        }; //Primeiro valor vazio, pois a contagem inicia-se do zero

        Scanner in = new Scanner(System.in);

        System.out.println("-->VERIFICA O DIA DA SEMANA ATRAVÉS DO NÚMERO INSERIDO<--");
        System.out.println("Digite um número entre 1 e 7: ");
        number = in.nextInt();

        if (number >= 1 && number <= 7) {
            System.out.println("O dia correspondente ao número " + number + " é: " + days[number]);
        } else {
            System.out.println("Número inválido!");
        }
    }
}
