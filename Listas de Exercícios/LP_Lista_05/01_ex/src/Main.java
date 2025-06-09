public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("-->INVERTE A ORDEM DOS VETORES<--");
        for (int i = vetor.length - 1; i >= 0; i--) { //vetor.length utilizado para indicar o tamanho (número de elementos) de um array
            System.out.print(vetor[i] + " ");
        }
    }
}
