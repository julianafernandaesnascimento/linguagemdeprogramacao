import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double base, altura, resultado;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A ÁREA DE UM TRIÂNGULO RETÂNGULO<--");
        System.out.println("Digite o tamanho da base em cm do triângulo: ");
        base = in.nextDouble();
        System.out.println("Digite o tamanho da altura em cm do triângulo: ");
        altura = in.nextDouble();

        resultado = (base*altura)/2;
        System.out.println("A área do triângulo retângulo é: " +String.format("%.2f", resultado) + "cm²");
}
}