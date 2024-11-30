package functioninterfacewithlambdaexpres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primenumberwithfilter {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9);


        num.stream().filter(Primenumberwithfilter:: isPrime).forEach(System.out::println);


    }
}
