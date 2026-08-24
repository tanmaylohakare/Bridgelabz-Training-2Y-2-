package Arrays.Section_AN.arrays.LogicBuilding;

public class PairSum {

    public static int pairSum(int arr[],int target)
    {   int pairCount=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }

    public static int tripletCount(int arr[],int target)
    {
        int tripleCount=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        tripleCount++;
                    }
                }
            }
        }
        return tripleCount;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=9;

        System.out.println("This is the count of pairs :-"+pairSum(arr,target));
    }

}
