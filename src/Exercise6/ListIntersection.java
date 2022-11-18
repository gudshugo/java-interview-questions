package Exercise6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given two arraylists of Integer, the algorithm must calculate and return the intersection between the two.
 *
 *Input: [1,2,3,4] and [1,5,6,3]
 *Output: [1,3]
 *
 */

public class ListIntersection {

    public static void main(String[] args){

        List<Integer> firstList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(1,5,6,3));
        System.out.println(intersactionOfLists(firstList, secondList));

    }

    private static Set<Integer> intersactionOfLists(List<Integer> first, List<Integer> second){

        Set<Integer> intersectionSet = new HashSet<>(first);

        return intersectionSet.stream()
                .filter(second::contains)
                .collect(Collectors.toSet());

    }

}
