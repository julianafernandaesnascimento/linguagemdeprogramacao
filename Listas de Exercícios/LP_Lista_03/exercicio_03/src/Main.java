import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A MÉDIA E INFORMA APROVAÇÃO OU REPROVAÇÃO<--");
        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 50){
            System.out.println("Aprovado! Sua média foi: " + String.format("%.2f", media));
        } else {
            System.out.println("Reprovado! Sua média foi: " + String.format("%.2f", media));
        }
        //String.format e %.2f para fixar o resultado em duas casas decimais
    }
}
