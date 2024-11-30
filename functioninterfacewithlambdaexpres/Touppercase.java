package functioninterfacewithlambdaexpres;

import java.util.stream.Collectors;

public class Touppercase {
    public static void main(String[] args) {
        String str = "hello world";

        // Convert each character to uppercase and collect them back into a string
        String result = str.chars()
                .mapToObj(Character::toUpperCase)
                .map(Character::toString)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
