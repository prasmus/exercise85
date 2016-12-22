/**
 * Created by Praktika on 22.12.2016.
 */
public class exercise_85 {
    public static void main (String[]args){
        int limit = 30;
        for (int n = 2; n <limit; n++){
            if(sieve(n)){
                System.out.println(n);
            }
        }
    }
    public static boolean sieve (int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }return true;

    }
}
