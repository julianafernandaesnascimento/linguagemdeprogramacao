import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double temperature,result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CONVERTE A TEMPERATURA DE GRAUS CELSIUS PARA FAHRENHEIT<--");
        System.out.println("Digite a temperatura em graus Celsius: ");
        temperature = in.nextDouble();

        result = temperature*1.8+32;
        System.out.println("A temperatura " +temperature +"ºC convertida  para ºF é: " +String.format("%.2f", result) +"ºF");
        //String.format e %.2f para fixar o resultado em duas casas decimais
    }
}