import java.util.Scanner;

public class troca{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int [] valores = new int[20];
        for (int i = 0; i < 20; i++){
            valores[i] = n.nextInt();
        }
        for (int c = 0; c < 10; ++c){
            int ant = valores[c];
            valores[c] = valores[19 - c];
            valores[19 - c] = ant;

        }
        for (int p = 0; p < 20; ++p){
            System.out.println("N[" + p + "] = " + valores[p]);
        }
    }
}