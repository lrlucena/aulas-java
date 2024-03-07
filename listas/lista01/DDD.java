import java.util.Scanner;
public class DDD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();
        if (ddd==61) {
            System.out.println("Brasilia");
        } else if(ddd==72) {
            System.out.println("Salvador");
        } else if(ddd==11) {
            System.out.println("Sao Paulo");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
