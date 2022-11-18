package Exercise7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Code method - Given a string in the format below, the algorithm must count the number of repeated letters and return the number on the side of the respective
 * character.
 *
 * Input: aabbccdd
 * Output: a2b2c2d2
 *
 * Decode method - Give a string in the format below (numbers between 0-9)
 * the algorithm must decode and return repeated letters based on the number placed before it.
 *
 * Input: a1b2c3d4
 * Output: abbcccdddd
 *
 */

public class StringCodeAndDecode {

    public static void main(String[] args){

        String inputToCode = "aabbccdd";
        String inputToUncode = "a1b2c3d4";
        System.out.println(code(inputToCode));
        System.out.println(decode(inputToUncode));

    }

    private static String code(String input){

        Map<Character, Integer> counterMap = new HashMap<>();

        for(int i=0; i < input.length(); i++){

            char aux = input.charAt(i);

            if(counterMap.containsKey(aux)){
                counterMap.put(aux, counterMap.get(aux) + 1);
            }else{
                counterMap.put(aux, 1);
            }

        }

        return counterMap.entrySet()
                .stream()
                .map(Objects::toString)
                .map(c -> c.replace("=", ""))
                .collect(Collectors.joining());

    }

    private static String decode(String input) {

        StringBuilder str = new StringBuilder();

        for(int i=0; i<input.length(); i++){

            char currentElement = input.charAt(i);

            if(Character.isDigit(currentElement)){

                char previousElement = input.charAt(i-1);
                str.append(repeat(previousElement, Character.getNumericValue(currentElement)));

            }

        }

        return str.toString();

    }

    private static String repeat(char c, int size){
        char[] chars = new char[size];
        Arrays.fill(chars, 0, size, c);
        return new String(chars);
    }

}
