package nbduc.crimson.codility.sorting;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
        int A[] = new int[]{10,2,5,1,8,20};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if(A[i + 2] > A[i] + A[i + 1]) {
                return 1;
            }
        }
        return 0;
    }

}
