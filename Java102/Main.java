package Java102;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grid<Integer> grid = new Grid<>(3, 0);

        grid.set(0, 0, 1);
        grid.set(1, 1, 9);
        grid.set(2, 2, 4);

        System.out.println("Grid:\n" + grid);
        ArrayList<Integer> diagonal = grid.diagonal();
        System.out.println("Diagonal: " + diagonal);
    }
}
