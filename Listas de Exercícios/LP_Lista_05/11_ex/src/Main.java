import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int linhasA, linhasB, colunasA, colunasB;

        System.out.println("--> REALIZA A MULTIPLICAÇÃO ENTRE DUAS MATRIZES COM VALORES INFORMADOS PELO USUÁRIO <--");
        //Dimensões da primeira matriz
        System.out.print("Informe o número de linhas da primeira matriz: ");
        linhasA = in.nextInt();
        System.out.print("Informe o número de colunas da primeira matriz: ");
        colunasA = in.nextInt();

        // Dimensões da segunda matriz
        System.out.print("Informe o número de linhas da segunda matriz: ");
        linhasB = in.nextInt();
        System.out.print("Informe o número de colunas da segunda matriz: ");
        colunasB = in.nextInt();

        // Se não for possível realizar a multiplicação entre matrizes
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes!");
            System.out.println("O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            return;
        }

        // Declarar e preencher a primeira matriz
        int[][] A = new int[linhasA][colunasA];
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = in.nextInt();
            }
        }

        // Declarar e preencher a segunda matriz
        int[][] B = new int[linhasB][colunasB];
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = in.nextInt();
            }
        }

        // Calcular a matriz produto
        int[][] C = new int[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Os produtos das matrizes são (A x B): ");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
