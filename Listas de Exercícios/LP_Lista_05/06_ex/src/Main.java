public class Main {
    public static void main(String[] args) {
        int [] v1 = {1, 2, 3, 4, 5, 6};
        int temp = 0;

        System.out.println("--> INVERTE A PSIÇÃO DO VETOR DECLARADO <--");
        for(int i = 0; i <v1.length/2; i++){
            temp = v1[i];
            v1[i] = v1[v1.length -1 -i];
            v1[v1.length -1 -i] = temp;
        }
        for (int v : v1)
            System.out.print(v + " ");
    }
}