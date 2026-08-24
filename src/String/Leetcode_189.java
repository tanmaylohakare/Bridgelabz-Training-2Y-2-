package String;

import java.util.Arrays;

public class Leetcode_189 {

    public void rotate(int[] nums, int k) {

    k = k % nums.length;

    int n = nums.length - 1;

    reverse(nums, 0, n);
    reverse(nums, 0, k - 1);
    reverse(nums, k, n);
}

    public static void reverse(int[] nums, int i, int j) {

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        Leetcode_189 l1=new Leetcode_189();
        l1.rotate(arr,k);

        System.out.println(Arrays.toString(arr));
    }
}
