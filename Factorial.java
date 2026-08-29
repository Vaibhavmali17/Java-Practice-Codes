
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;

        for(int num = 10; num>=1;num--){
            fact = fact * num;
        }
        System.out.println(fact);

    }
}