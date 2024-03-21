import java.util.Scanner;
public class Bee1172{
  public static void main(String[] args){
    int[] vetor = new int[10];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <=9; i++){
      vetor [i] = sc.nextInt();
      if (vetor[i] <= 0){
        vetor[i] = 1;
      }
    }
    sc.close();
    for (int i = 0; i <=9; i++){
      System.out.println("X[" + i + "] = " + vetor[i]);
    }
  }
}