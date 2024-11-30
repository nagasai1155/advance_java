package functioninterfacewithlambdaexpres;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List <Integer> names = Arrays.asList(3,4,5,6);

        names.stream().count();
    }
}
