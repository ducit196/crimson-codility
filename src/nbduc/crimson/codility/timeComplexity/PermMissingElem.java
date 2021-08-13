package nbduc.crimson.codility.timeComplexity;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermMissingElem {

    public static void main(String[] args) {
        int A[] = new int[]{2,3,1,5};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> full = new HashSet<>();
        for (int i = 1; i <= A.length + 1; i++) {
            full.add(i);
        }
        for (int i : A) {
            full.remove(i);
        }
        return full.iterator().next();
    }
}
