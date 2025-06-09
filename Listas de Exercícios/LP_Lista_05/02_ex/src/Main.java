public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("--> SOMA 2 NOS ÍNDICES PARES E MULTIPLICA POR 2 NOS ÍMPARES <--");

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = vetor[i] + 2;
            } else {
                vetor[i] = vetor[i] * 2;
            }
        }

        for (int n : vetor) {
            System.out.print(n + " ");
        }
    }
}
