package Java101;
public class PracticeProblems {
public static int[] reverseArray(int[] arr) {
    int n = arr.length;
    int[] reversed = new int[n];
for (int i = 0; i < n; i++) {
    reversed[i] = arr[n - 1 - i];
}
return reversed;
    }
}


