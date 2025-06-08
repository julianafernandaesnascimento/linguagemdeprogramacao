import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double speed, result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE KM/H PARA M/S<--");
        System.out.println("Digite a velocidade em km/h: ");
        speed = in.nextDouble();

        result = speed/3.6;
        System.out.println("A velocidade " +speed +"km/h convertida  para m/s é: " +String.format("%.2f", result) +"m/s");
        //String.format e %.2f para fixar o resultado em duas casas decimais
    }
}