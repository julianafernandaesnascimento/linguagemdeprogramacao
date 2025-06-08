import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, altura, volume;

        Scanner in = new Scanner(System.in);
        System.out.println("--> CALCULA O VOLUME DE UM CILINDRO A PARTIR DE SEU RAIO E ALTURA <--");
        System.out.print("Digite o raio (em cm) do cilindro: ");
        raio = in.nextDouble();
        System.out.print("Digite a altura (em cm) do cilindro: ");
        altura = in.nextDouble();

        volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cone é: " + String.format("%.2f", volume) + "cm²");
    }
}
