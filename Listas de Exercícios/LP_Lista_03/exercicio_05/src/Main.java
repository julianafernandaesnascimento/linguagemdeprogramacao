import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A MÉDIA E EXIBE O CONCEITO<--");
        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 8.5){
            System.out.println("Nota A! Sua média foi: " + String.format("%.2f", media));
        }
        else if(media >= 7){
            System.out.println("Nota B! Sua média foi: " + String.format("%.2f", media));
        }
        else if(media >= 5){
            System.out.println("Nota C! Sua média foi: " + String.format("%.2f", media));
        }
        else {
            System.out.println("Nota D! Sua média foi: " + String.format("%.2f", media));
        }
        //String.format e %.2f para fixar o resultado em duas casas decimais
    }
}
