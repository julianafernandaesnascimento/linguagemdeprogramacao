import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double distance, result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A VELOCIDADE DE KM PARA MI<--");
        System.out.println("Digite a distância em KM: ");
        distance = in.nextDouble();

        result = distance/1.609;
        System.out.println("A distancia " +distance +"km convertida para Mi é: " +String.format("%.2f", result) +"Mi");
        //String.format e %.2f para fixar o resultado em duas casas decimais
    }
}