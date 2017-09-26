public class BinaryIterativeSearch implements Practice2Search {

	/*
	There is no point to assigning a variable here.  
	return "BinaryIterativeSearch";
	*/
	@Override
	public String searchName() {
		String funcName = "BinaryIterativeSearch";
		return funcName;
	}

	@Override
	public int search(int[] arr, int target) {
		
		int beg = 0;
		int end = arr.length - 1;

		while (beg <= end) {
			
			int mid = (beg + end) / 2;
			
			if (target < arr[mid]) {
				end = mid - 1;
			}

			if (target > arr[mid]) {
				beg = mid + 1;
			}
			
			/*
			It makes more sense to have this first (It's your base case)
			*/
			if (target == arr[mid]) {
				return mid;
			}
		}
		return -1;

	}
	
}
