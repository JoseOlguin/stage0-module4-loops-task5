package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int x = 1, y = height; x <= height; x++, y--) {
            for (int k = 1; k <= height; k++) {
                System.out.print((k >= x && k <= y) || (k >= y && k <= x) ? '8' : ' ');
            }
            System.out.println();
        }
    }
}
