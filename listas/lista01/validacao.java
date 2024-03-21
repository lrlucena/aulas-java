import java.util.Scanner;

public class validacao{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        while (cont != 2){
            double nota = n.nextDouble();
            if (nota >=0 && nota <= 10){
                cont++;
                soma += nota;
            }
            else{
                System.out.println("nota invalida");
            }
        }
        n.close();
        double media = soma / 2.0;
        System.out.println("media = " + media);
    }
}