public class Main {
    public static void main(String[] args) {

        System.out.println("--> REALIZA A MULTIPLICAÇÃO ENTRE DUAS MATRIZES <--");
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10}
        };

        int[][] C = new int[3][2]; // 3 colunas * 2 colunas

        for (int i = 0; i < 3; i++) { //primeira matriz
            for (int j = 0; j < 2; j++) { //segunda matriz
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) { //resultado entre a multiplicação das matrizes
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz produto (C = A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
