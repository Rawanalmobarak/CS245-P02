public class BinaryRecursiveSearch implements Practice2Search {

	/*
	See IterativeSearch
	*/
	@Override
	public String searchName() {
		String funcName = "BinaryRecursiveSearch";
		return funcName;
	}

	/*
	Once again, it's unnecessary to assign a variable here.
	*/
	@Override
	public int search(int[] arr, int target) {

		int result = BinaryS(arr, target, 0, arr.length - 1);
		return result;
	}

	public int BinaryS(int[] arr, int target, int beg, int end) {

		if (beg < end) {
			/*
			Should be 
			int mid = (beg + end) /2;
			It should be the midpoint between two points 
			It's simply the average of the beginning and end
			*/
			int mid = beg + (end - beg) / 2;
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
