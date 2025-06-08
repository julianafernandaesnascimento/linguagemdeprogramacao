import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double note1, note2, result;

        System.out.println("-->CALCULA A MÉDIA DE DUAS NOTAS COM PESO DIFERENTE<--");
        System.out.println("Digite duas notas: ");

        Scanner in = new Scanner(System.in);
        note1 = in.nextDouble();
        note2 = in.nextDouble();

        result = (note1 + note2*2)/3;
        System.out.println("A média das notas inseridas é: " + result);
    }
}