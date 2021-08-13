package nbduc.crimson.codility.iterations;

public class BinaryGap {

    public static void main(String[] args) {
        solution(32);
    }

    public static int solution(int n) {
        int maxSeq = 0;
        String s = Integer.toBinaryString(n);
        int currentSeq = 0;
        for (char c : s.toCharArray()) {
            if(48 == c) {
                currentSeq ++;
            } else {
                if(currentSeq > maxSeq) {
                    maxSeq = currentSeq;
                }
                currentSeq = 0;
            }
        }
        return maxSeq;
    }

}
