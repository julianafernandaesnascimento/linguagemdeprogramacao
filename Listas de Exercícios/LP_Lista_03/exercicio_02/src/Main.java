import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;

        Scanner in = new Scanner(System.in);

        System.out.println("-->COMPARA DOIS NÚMEROS INTEIROS E INFORMA O MAIOR DELES<--");
        System.out.println("Digite o primeiro número: ");
        number1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        number2 = in.nextInt();

        if(number1 > number2){
            System.out.println("O primeiro número (" + number1 + ") é maior!");
        } else if(number2 > number1){
            System.out.println("O segundo número (" + number2 + ") é maior!");
        } else {
            System.out.println("Os dois números são iguais!");
        }
    }
}
