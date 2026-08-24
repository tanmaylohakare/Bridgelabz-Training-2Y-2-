package Arrays.Section_AN.arrays.leetcode;

import java.util.Arrays;

public class Leetcode_1929 {
    public static int[] getCon(int nums[])
    {
        int n=nums.length;
        int answer[]=new int[2*n];
        for(int i=0;i<nums.length;i++)
        {
           answer[i]=nums[i];
        }
        int index=0;

        for(int i=nums.length;i<answer.length;i++)
        {
            answer[i]=nums[index];
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[]={1,2,1};

        int target[]=getCon(nums);

        System.out.println(Arrays.toString(target));

    }
}
