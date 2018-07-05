import java.util.HashMap;

public class PairSum {

	public static void pairSum(int sum, Integer[] arr) {
		HashMap<Integer, Boolean> seen = new HashMap<>();
		int j = 0;
		for (int i : arr) {
			j++;
			int complement = sum - i;
			if ( seen.containsKey(complement)) {
				System.out.print(i + "," + complement+", ");
			} else {
				seen.put(i, true);
			}
		}
	}
	
	
	public static void main(String[] args) {
		pairSum(10, new Integer[]{2,3, 4, 5, 6, 7,8});
		pairSum(8, new Integer[]{4}); 
	}

}
