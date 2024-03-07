public class Ddd2 {
    public static void main(String[] args){
        int ddd = 10;
        String capital = switch(ddd) {
            case 11 -> "Sao Paulo";
            default -> "DDD nao cadastrado";
        };
        System.out.println(capital);
    }    
}
