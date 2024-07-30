package school.mjc.stage0.loops.task5;

import java.util.Random;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int x = 1; x <= sideLength; x++) {
            for (int y = 1; y <= sideLength; y++) {
                System.out.print(x == 1 || x == sideLength || y == 1 || y == sideLength ? '8' : ' ');
            }
            System.out.println();
        }
    }
}
