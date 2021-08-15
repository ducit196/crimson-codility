package nbduc.crimson.codility.leader;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public static void main(String[] args) {
        int A[] = new int[]{9,3,9,3,9,7};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> cal = new HashMap<>();
        if(A.length < 1) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {
            if(cal.get(A[i]) == null) {
                cal.put(A[i], 1);
            } else {
                cal.put(A[i], cal.get(A[i]) + 1);
            }
            if(cal.get(A[i]) > A.length / 2) {
                return i;
            }
        }
        return -1;
    }


}
