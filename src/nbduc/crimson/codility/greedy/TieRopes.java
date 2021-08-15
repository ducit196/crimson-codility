package nbduc.crimson.codility.greedy;

public class TieRopes {

    public static void main(String[] args) {
        int A[] = new int[]{1,2,3,4,1,1,3};
        System.out.println(solution(4,A));

    }

    public static int solution(int K, int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int length = 0;
        for (int i : A) {
            length += i;
            if(length >= K) {
                count++;
                length = 0;
            }
        }
        return count;
    }

}
