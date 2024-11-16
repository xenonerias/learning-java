package Java101;
public class Main {
	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int[] reversed = new int[n];
	for (int i = 0; i < n; i++) {
		reversed[i] = arr[n - 1 - i];
	}
	return reversed;
	}
    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 9, 10, 11, 14};
        int[] reversedArr = reverseArray(arr);  
        
		for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}