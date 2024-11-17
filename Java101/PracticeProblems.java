package Java101;
public class PracticeProblems {
 // work for problem 4
public static int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
    int next = a + b;
    a = b;
    b = next;
}

return b;

}

// work for problem 3
public static double sumGrid(double[][] grid) {
    double sum = 0.0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            sum += grid[i][j];
}
        }
        return sum;
    }

// work for problem 2 
public static int[] reverseArray(int[] arr) {
    int n = arr.length;
    int[] reversed = new int[n];
for (int i = 0; i < n; i++) {
    reversed[i] = arr[n - 1 - i];
}
return reversed;
}

// work for problem 1 
	public static int countOccurances(int[]arr, int n){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		  if (arr[i] == n) {
			  count++;
		  }
  }
	  return count;
  }
}