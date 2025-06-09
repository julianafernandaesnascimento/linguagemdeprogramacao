public class Main {
    public static void main(String[] args) {
        System.out.println("-->EXIBE A TABELA DE CONVERSÃO DE GRAUS CELSIUS PARA FAHRENHEIT<--");
        System.out.println("Tabela Celsius para Fahrenheit:");
        System.out.println("Celsius\tFahrenheit");

        for (int c = -80; c <= 80; c += 10) {
            double f = (9.0 / 5) * c + 32;
            System.out.printf("%d\t%.1f\n", c, f);
        }
    }
}
