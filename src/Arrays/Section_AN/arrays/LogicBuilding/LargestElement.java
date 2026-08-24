package Arrays.Section_AN.arrays.LogicBuilding;

public class LargestElement {

    public static int maxValue(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
    return max;
    }

    public static int secondMax(int arr[])
    {
       int second= maxValue(arr);
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==second)
           {
               arr[i]=Integer.MIN_VALUE;
           }
       }
       int secondMax=maxValue(arr);

       return secondMax;

    }

    public static void main(String[] args) {

        int arr[]={7,2,3,7,5,6,7};
        System.out.println("This is the maximum Element in an Array :- "+maxValue(arr));
        System.out.println("This is the second Maximum Element in an Array:- "+secondMax(arr));
    }

}
