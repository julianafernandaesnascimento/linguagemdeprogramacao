public class Main {
    public static void main(String[] args) {

        System.out.println("-->NÚMEROS INTEIROS DIVISÍVEIS POR 4 E MENORES QUE 200<--");
        System.out.println("Números positivos e inteiros divisíveis por 4 e menores que 200: ");

        for (int i = 4; i < 200; i += 4) {
            System.out.print(i + ", ");
        }
    }
}
