import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {1, 3, 5, 7, 9};

        System.out.println("Array: 1, 3, 5, 7, 9");
        System.out.print("Digite o número que deseja buscar: ");
        int alvo = in.nextInt();

        int posicao = buscaBinaria(array, alvo, 0, array.length - 1);

        if (posicao == -1) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Número encontrado na posição: " + posicao);
        }
    }

    public static int buscaBinaria(int[] arr, int alvo, int inicio, int fim) {
        if (inicio > fim) {
            return -1; // elemento não encontrado
        }

        int meio = (inicio + fim) / 2;

        if (arr[meio] == alvo) {
            return meio; // elemento encontrado
        } else if (arr[meio] < alvo) {
            return buscaBinaria(arr, alvo, meio + 1, fim); // busca na metade direita
        } else {
            return buscaBinaria(arr, alvo, inicio, meio - 1); // busca na metade esquerda
        }
    }
}
