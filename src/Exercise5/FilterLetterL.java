package Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of String, the algorithm must find and return the letter 'L' in it.
 *
 * Input: {"a", "b", "c", "l"}
 * Output: l
 *
 */

public class FilterLetterL {

    public static void main(String[] args){

        String[] input = {"a", "b", "l"};
        System.out.println(filterLetterL(input, "b"));

    }

    private static String filterLetterL(String[] letters, String letter){

        List<String> arrayLetters = Arrays.asList(letters);

        return arrayLetters.stream()
                .filter(c -> c.equals(letter))
                .collect(Collectors.joining());

    }

}
