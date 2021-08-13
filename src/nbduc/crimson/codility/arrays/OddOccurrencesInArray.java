package nbduc.crimson.codility.arrays;

import java.util.HashMap;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int A[] = new int[]{9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if(null != A && A.length > 0) {
            int up = 0;
            for (int i = 0; i < A.length; i++) {
                up ^= A[i];
            }
            return up;
        }
        return -1;
    }

}
