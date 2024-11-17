package Java101;
public class Main {
	public static double sumGrid(double[][] grid) {
        double sum = 0.0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				sum += grid[i][j];
	}
			}
			return sum;
		}
	    public static void main(String[] args) {
			double[][] grid = {
				{6.7, 5.2, 3.9},
				{4.0, 9.5, 6.6},
				{6.7, 2.8, 2.9}
			};

			System.out.println(sumGrid(grid));
	}
}