package Arrays.Section_AN.arrays.leetcode;

public class LeetCode_977 {
        public static int[] sortedSquare(int nums[])
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }

    public static void main(String[] args) {

    }
}
