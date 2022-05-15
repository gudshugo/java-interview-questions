package Exercise2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string value with a Roman number, the algorithm should convert it to an integer.
 *
 * Input: XVI
 * Output: 16
 */

public class RomanToInt {

    public static void main(String[] args){

        int result = romanToInt("MCMXCIV");

        System.out.println(result);
    }

    private static int romanToInt(String s){

        Map<Character, Integer> nums = new HashMap<>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);

        char[] characters = s.toCharArray();

        int result = 0;

        for (int i=0; i<characters.length; i++) {
            if(i > 0 && nums.get(characters[i]) > nums.get(characters[i-1]))
                result = result + nums.get(characters[i]) - 2 * nums.get(characters[i-1]);
            else
                result += nums.get(characters[i]);
        }

        return result;
    }

}
