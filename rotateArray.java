class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
		k %= n;

		if (k > 0) {
			int[] arr = new int[n];
			int j = 0;
			for (int i = n - k; i < n; i++) {
				arr[j++] = nums[i];
			}
			for (int i = 0; i < n - k; i++) {
				arr[j++] = nums[i];
			}
            System.arraycopy(arr, 0, nums, 0, n);
		}
    }
}
