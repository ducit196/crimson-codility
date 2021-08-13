package nbduc.crimson.codility.arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int A[] = new int[]{};
        int result[] = solution(A, 3);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] A, int k) {
        if(null != A && A.length > 0) {
            for (int i = 0; i < k; i++) {
                A = rotate(A);
            }
        }
        return A;
    }

    public static int[] rotate(int[] A) {
        int result[] = new int[A.length];
        for (int i = 0; i < A.length - 1; i++) {
            result[i + 1] = A[i];
        }
        result[0] = A[A.length - 1];
        return result;
    }


}
