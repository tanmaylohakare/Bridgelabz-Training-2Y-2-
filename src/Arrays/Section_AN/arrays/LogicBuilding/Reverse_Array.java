package Arrays.Section_AN.arrays.LogicBuilding;

public class Reverse_Array {
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int arr[])
    {
        int a=0;
        int b=arr.length-1;

        while (a<b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }

        display(arr);

    }

}
