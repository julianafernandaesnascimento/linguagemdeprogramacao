import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double measure, result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A MEDIDA DE MILIMETROS PARA POLEGADA<--");
        System.out.println("Digite a medida em milimetros: ");
        measure = in.nextDouble();

        result = measure/25.4;
        System.out.println("A medida " +measure +" milímetro convertida  para polegada é: " +String.format("%.2f", result) +" polegadas");
        //String.format e %.2f para fixar o resultado em duas casas decimais

    }
}