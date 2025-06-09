public class Main {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[v1.length];

        System.out.println("--> INVERSÃO DOS ELEMENTOS DOS VETORES <--");
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.print("Vetor inicial: ");
        for (int n : v1) {
            System.out.print(n + " ");
        }

        System.out.println(""); //pula uma linha, apenas para uma melhor visualização
        System.out.println("---------------------------------------");

        System.out.print("Vetor invertido: ");
        for (int n : v2) {
            System.out.print(n + " ");
        }
    }
}
