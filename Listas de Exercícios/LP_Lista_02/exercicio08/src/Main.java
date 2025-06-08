import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double measure, result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A MEDIDA DE POLEGADAS PARA MILÍMETRO<--");
        System.out.println("Digite a medida em polegadas: ");
        measure = in.nextDouble();

        result = measure*25.4;
        System.out.println("A medida " +measure +" poleda convertida  para milímetro é: " +String.format("%.2f", result) +" milímetro");
        //String.format e %.2f para fixar o resultado em duas casas decimais

    }
}