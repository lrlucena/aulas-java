import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class fila{
    public static void main(String[] args) throws IOException{
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();
        int M = 0;
        int contador = 0;

        for(int i=0; i<N; i++){
            M = x.nextInt();
            contador = 0;
            int[] vet = new int[M];

            for(int j=0; j<M; j++){
                vet[j] = x.nextInt();
            }
            // ORDENANDO O VETOR EM ORDEM DECRESCENTE
            int[] vetord = vet.clone();
            Arrays.sort(vetord);
            int [] vetdec = new int[M];
            int ultimo = M-1;
            for(int k=0; k<M; k++){     // CRIANDO UM OUTRO VETOR PARA COLOCÁ-LO EM ORDEM DEC
                vetdec[k] = vetord[ultimo];
                ultimo--;
            }
            for(int l=0; l<M; l++){
                if(vetdec[l]==vet[l]){
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}