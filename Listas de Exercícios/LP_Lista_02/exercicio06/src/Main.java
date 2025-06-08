import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double speed, result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE M/S PARA KM/H<--");
        System.out.println("Digite a velocidade em m/s: ");
        speed = in.nextDouble();

        result = speed*3.6;
        System.out.println("A velocidade " +speed +"m/s convertida  para km/h é: " +String.format("%.2f", result) +"km/h");
        //String.format e %.2f para fixar o resultado em duas casas decimais
    }
}