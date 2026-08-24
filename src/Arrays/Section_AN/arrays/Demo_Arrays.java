package Arrays.Section_AN.arrays;

import java.util.Arrays;

public class Demo_Arrays {

    public static void main(String[] args) {
        int size=5;
        int arr[]=new int [size];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+ " ");
    }
        System.out.println();
    int other[]=arr;
        other[1]=10;

        System.out.println(Arrays.toString(other));

    }

}
