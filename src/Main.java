import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final int[][] multi = new int[][]{
            {2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
            {1, 3, 5, 7},
            {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}
    };

    private static List<Integer> nearby(int x, int y, int range) {
        int[] currentLine = multi[x];
        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < currentLine.length; i++) {
            if (Math.abs(y - i) <= range && i != y) {
                resultArray.add(currentLine[i]);
            }
        }
        return resultArray;
    }


    public static void main(String[] args) {
        // 1. task
        System.out.println("1. task");
        for (int i : nearby(0, 2, 2)) {
            System.out.println(i);
        }
        System.out.println("2. task");
        for (int i : nearby(1, 0, 1)) {
            System.out.println(i);
        }
        System.out.println("3. task");
        for (int i : nearby(1, 3, 5)) {
            System.out.println(i);
        }
    }
}
