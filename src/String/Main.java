package String;
/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("a -> "+ a +" "+ "b -> "+b);
        swap(a,b);

        // System.out.println("After swap :- ");
        // System.out.println("a -> "+ a +" "+ "b -> "+b);

        int arr[]={10,20,5,3,8};

        swapArray(arr,0,1);

        display(arr);

    }

    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a -> "+ a +" "+ "b -> "+b);
    }

    public static void swapArray(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}