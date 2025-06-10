import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {1, 3, 5, 7, 9};

        System.out.println("Array: 1, 3, 5, 7, 9");
        System.out.print("Digite o número que deseja buscar: ");
        int alvo = in.nextInt();

        int posicao = buscaBinaria(array, alvo);

        if (posicao == -1) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Número encontrado na posição: " + posicao);
        }
    }

    public static int buscaBinaria(int[] arr, int alvo) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (arr[meio] == alvo) {
                return meio;  // achou o número
            }

            if (arr[meio] < alvo) {
                inicio = meio + 1;  // procura do meio+1 até o fim
            } else {
                fim = meio - 1;     // procura do início até meio-1
            }
        }

        return -1;
    }
}
