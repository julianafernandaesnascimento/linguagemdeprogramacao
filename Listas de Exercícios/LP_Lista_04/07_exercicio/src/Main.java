public class Main {
    public static void main(String[] args) {

        System.out.println("-->EXIBE TODAS AS TABUADAS DO 1 AO 10<--");
        for (int i=1; i<11; i++){
            for (int j=0; j<11; j++)
                System.out.println(i + "x" + j + "=" + (i*j));
            System.out.println("__________");
        }
    }
}