import java.util.Scanner;

public class troca2{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int tamanho = 20;
        int [] valores = new int[tamanho];
        for (int i = valores.length - 1; i >= 0; i--){
            valores[i] = n.nextInt();
        }
        for (int p = 0; p < valores.length; ++p){
            System.out.println("N[" + p + "] = " + valores[p]);
        }
    }
}