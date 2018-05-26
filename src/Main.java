import java.lang.reflect.Array;
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

    private static int[] newNearby(int x, int y, int range) {
        int[] currentLine = multi[x];
        int[] leftPart;
        int[] rightPart;
        if (y != 0) {
            leftPart = Arrays.copyOfRange(currentLine, y - Math.min(y, range), y);
        } else {
            leftPart = new int[0];
        }
        if (y != currentLine.length - 1) {
            rightPart = Arrays.copyOfRange(currentLine, y + 1, Math.min(currentLine.length, y + range + 1));
        } else {
            rightPart = new int[0];
        }
        int[] resultArray = new int[leftPart.length + rightPart.length];
        System.arraycopy(leftPart, 0, resultArray, 0, leftPart.length);
        System.arraycopy(rightPart, 0, resultArray, leftPart.length, rightPart.length);
        return resultArray;
    }


    public static void main(String[] args) {
        /*
        // 1. task
        System.out.println("1. task");
        for (int i : nearby(0, 2, 2)) {
            System.out.println(i);
        }
        System.out.println("2. task");
        for (int i : nearby(1, 0, 1)) {
            System.out.println(i);
        }*/
        System.out.println("3. task");
        for (int i : nearby(1, 3, 5)) {
            System.out.println(i);
        }
        System.out.println("Static arrays:");
        for (int i : newNearby(0, 2, 10)) {
            System.out.println(i);
        }

    }
}

