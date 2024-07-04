package array;

import java.util.ArrayList;
import java.util.List;

public class SubSetArray {
	public static void main(String[] args) {
   
	}

	private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {

		if (index == nums.length) {
			ans.add(new ArrayList<>(output));
			return;
		}

		// include
		output.add(nums[index]);
		solve(nums, output, index + 1, ans);

		// Exclude
		output.remove(output.size() - 1);
		solve(nums, output, index + 1, ans);
		System.out.println(output);

	}

	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> ans = new ArrayList<>();

		List<Integer> output = new ArrayList<>();

		int index = 0;

		solve(nums, output, index, ans);
		return ans;
	}

}
