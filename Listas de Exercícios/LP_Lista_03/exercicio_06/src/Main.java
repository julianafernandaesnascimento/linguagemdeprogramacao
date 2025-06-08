import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CAIXA ELETRÔNICO: ESCOLHA UMA OPÇÃO<--");
        System.out.println("Escolha uma opção entre 5 e 9: ");
        opcao = in.nextInt();

        if(opcao >= 5 && opcao <= 9){
            System.out.println("Você escolheu a opção: " + opcao);
        } else {
            System.out.println("Opção inválida, tente novamente!");
        }
    }
}
