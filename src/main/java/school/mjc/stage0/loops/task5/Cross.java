package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        int m = (int) ((sideLength + 1.0f) / 2.0f);

        for (int x = 1; x <= sideLength; x++) {
            for (int y = 1; y <= sideLength; y++) {
                System.out.print(x == m || y == m ? '8' : ' ');
            }
            System.out.println();
        }
    }
}
