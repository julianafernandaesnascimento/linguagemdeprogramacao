public class Main {
    public static void main(String[] args) {

        System.out.println("--> EXIBE A DIAGONAL PRINCIPAL DE UMA MATRIZ <--");
        int[][] matriz = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {110, 120, 130, 140, 150},
                {160, 170, 180, 190, 200},
                {210, 220, 230, 240, 250}
        };

        System.out.println("Diagonal principal da matriz:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
