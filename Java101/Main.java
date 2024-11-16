package Java101;
public class Main {
	public static int countOccurances(int[]arr, int n){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		  if (arr[i] == n) {
			  count++;
		  }
  }
	  return count;
  }
  
	
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 2, 4, 2, 5};
			int n = 2;
			
		
			System.out.println(countOccurances(arr, n)); 
		}
	}
