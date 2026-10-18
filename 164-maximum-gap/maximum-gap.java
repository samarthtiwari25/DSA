import java.util.Arrays;

class Solution {
public int maximumGap(int[] nums) {
Arrays.sort(nums);
    if (nums.length < 2) {
        return 0;
    }

    int max = 0;

    for (int i = 1; i < nums.length; i++) {
        int gap = nums[i] - nums[i - 1];

        if (gap > max) {
            max = gap;
        }
    }

    return max;
}


}