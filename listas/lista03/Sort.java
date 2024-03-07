import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int a, b, c;
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();
        int menor, meio, maior;
        if (a<=b && a<=c){
            menor = a;
        } else if(b <=c) {
            menor = b;
        } else {
            menor = c;
        }
        maior = a;
        if(b>maior){
            maior = b;
        }
        if(c>maior){
            maior = c;
        }
        meio = a + b + c - maior - menor;
        System.out.println(menor+"\n"+meio+"\n"+maior);
        System.out.println();
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
