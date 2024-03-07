import java.util.Scanner;

public class DDD2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();
        String resposta = switch(ddd) {
            case 61 -> "Brasilia";
            case 72 -> "Salvador"; 
            case 11 -> "Sao Paulo";
            default -> "DDD nao cadastrado";
        };
        System.out.println(resposta);
    }
}