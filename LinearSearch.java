public class LinearSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "LinearSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
