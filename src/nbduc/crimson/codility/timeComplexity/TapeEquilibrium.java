package nbduc.crimson.codility.timeComplexity;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int A[] = new int[]{3,1,2,4,3};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < A.length - 1; i++) {
            int dis = distance(A, i);
            if(dis < min) {
                min = dis;
            }
        }
        return min;
    }

    public static int distance(int[] A, int p) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < A.length; i++) {
            if(i <= p -1) {
                leftSum += A[i];
            } else {
                rightSum += A[i];
            }
        }
        return Math.abs(leftSum - rightSum);
    }
    

}
