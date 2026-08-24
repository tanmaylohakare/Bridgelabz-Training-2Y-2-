package String;

import java.util.Arrays;

class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 6, 2, 9, 7};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        Solution obj = new Solution();

        obj.sortArray(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}