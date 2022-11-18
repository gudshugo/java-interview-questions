package Exercise3;

import java.util.*;
import java.util.stream.Collectors;

/**

 Given a string in alphanumeric format, the algorithm must count the number of letters in it.

 Input: aaa3bb5bc2c
 Output: 8

 */

public class CountingLetters {

    public static void main(String[] args){

        String input = "1a2bb3xc3dff";
        countingLetters(input);

    }

    private static int countingLetters(String input){

        int count = 0;

        for(int i=0; i<input.length(); i++){

            char aux = input.charAt(i);

            if(Character.isLetter(aux)){
                count++;
            }

        }

        return count;
    }

}
