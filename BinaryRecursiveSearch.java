public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "BinaryRecursiveSearch";

	}

	@Override
	public int search(int[] arr, int target) {

		int result = BinaryS(arr, target, 0, arr.length - 1);
		return result;
	}

	public int BinaryS(int[] arr, int target, int beg, int end) {

		if (beg < end) {
			int mid = (beg + end) /2;
			if (target < arr[mid]) {
				return BinaryS(arr, target, beg, mid);

			} else if (target > arr[mid]) {
				return BinaryS(arr, target, mid + 1, end);
			} else {
				return mid;
			}
		}
		return -1;

	}

}
