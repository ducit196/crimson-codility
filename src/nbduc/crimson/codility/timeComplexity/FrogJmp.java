package nbduc.crimson.codility.timeComplexity;

import java.util.Date;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(1, 6, 2));
    }

    public static int solution(int x, int y, int d) {
        return  (int)Math.ceil((double) (y - x) / (double)d);
    }

}
