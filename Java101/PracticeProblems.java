package Java101;
public class PracticeProblems {
    public static double sumGrid(double[][] grid) {
        double sum = 0.0;
        for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        sum = grid[i][j];
}
        }
        return sum;
    }
}