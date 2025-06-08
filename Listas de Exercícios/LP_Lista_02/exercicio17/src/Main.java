import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double velocidade0, aceleracao, tempo, resultado;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A VELOCIDADE DE UM CORPO ATRAVÉS DE SUA VELOCIDADE INICIAL, ACELERAÇÃO E TEMPO<--");
        System.out.println("Insira a velocidade inicial: ");
        velocidade0 = in.nextDouble();
        System.out.println("Insira a aceleração: ");
        aceleracao = in.nextDouble();
        System.out.println("Insira o tempo de percurso: ");
        tempo = in.nextDouble();

        resultado = (velocidade0+(aceleracao*tempo));
        System.out.println("A velocidade é: " +String.format("%.2f", resultado));
}
}