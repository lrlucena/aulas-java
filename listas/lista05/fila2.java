import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class fila2{
    public static void main(String[] args) throws IOException{
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();

        for(int i=0; i<N; i++){
            int M = x.nextInt();
            int contador = 0;
            int[] vet = new int[M];

            for(int j=M-1; j>=0; j++){
                vet[j] = x.nextInt();
            }
            // ORDENANDO O VETOR EM ORDEM DECRESCENTE
            int[] vetord = vet.clone();
            Arrays.sort(vetord);
            for(int l=0; l<M; l++){
                if(vetord[l]==vet[l]){
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}