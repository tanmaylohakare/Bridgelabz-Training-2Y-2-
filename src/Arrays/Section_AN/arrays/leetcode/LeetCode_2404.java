package Arrays.Section_AN.arrays.leetcode;

public class LeetCode_2404 {
    public static int mostFrequentEven(int[] nums) {

        int ans = -1;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                int count = 0;

                for (int j = 0; j < nums.length; j++) {

                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    ans = nums[i];
                }

                if (count == maxCount && nums[i] < ans) {
                    ans = nums[i];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[]={0,1,2,2,4,4,1};

        System.out.println(mostFrequentEven(nums));

    }
}
