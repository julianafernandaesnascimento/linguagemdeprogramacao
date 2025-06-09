public class Main {
    public static void main(String[] args) {

        System.out.println("--> EXIBE A MAIOR SOMA DAS LINHAS E COLUNAS DE UMA MATRIZ <--");
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int somaLinha, somaColuna;
        int maiorSomaLinha = 0;
        int maiorSomaColuna = 0;

        for (int i = 0; i < 5; i++) { //linhas
            somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
            }
        }

        for (int j = 0; j < 5; j++) { //colunas
            somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
            }
        }

        System.out.println("A maior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("A maior soma entre as colunas: " + maiorSomaColuna);
    }
}
