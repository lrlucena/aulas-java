import java.util.Scanner;

public class DDD1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();
        String resposta;
        switch(ddd) {
            case 61: resposta = "Brasilia"; break;
            case 72: resposta = "Brasilia"; break;
            case 11: resposta = "Sao Paulo"; break;
            default : resposta ="DDD nao cadastrado";
        }
        System.out.println(resposta);
    }
}
