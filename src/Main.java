import java.util.ArrayList;

public class Main {
    public static ArrayList<Long> counter = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(primeNthPrime(11000));

    }

    public static long primeNthPrime(long nth) {
        if (nth <= 0) {
            return 0;
        }
        for(long j = 2; j < Integer.MAX_VALUE; j++ ){
            boolean isPrime = true;
            for (long i = 2; i < j; i++) {
                if(j % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                counter.add(j);
                if(counter.size() == nth){
                    return counter.get((int)nth-1);
                }
            }
        }
        return 0;

    }
}