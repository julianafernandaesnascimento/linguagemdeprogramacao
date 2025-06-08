import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double circle;

        Scanner in = new Scanner(System.in);

        System.out.println("--> CALCULA A ÁREA DE UM CÍRCULO A PARTIR DE UM RAIO <--");
        System.out.println("Digite o raio em cm de um círculo: ");
        circle = in.nextDouble();

        double area = Math.PI * Math.pow(circle, 2);
        System.out.println("A área do círculo é: " + String.format("%.2f", area) + "cm²"); //String.format e %.2f para fixar o resultado em duas casas decimais
}
}