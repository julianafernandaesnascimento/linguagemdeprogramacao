import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double number, result;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A RAIZ QUADRADA DE UM NÚMERO POSITIVO<--");
        System.out.println("Digite um número real: ");
        number = in.nextDouble();

        if(number >= 1){
            result = Math.sqrt(number);
            System.out.println("A raiz quadrada de " + number + " é: " + String.format("%.2f", result));
            //String.format e %.2f para fixar o resultado em duas casas decimais
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
