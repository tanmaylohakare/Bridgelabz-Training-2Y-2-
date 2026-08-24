package Arrays.Section_AN.arrays.LogicBuilding;

public class Swap {

    public static void swapNumbers(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a +" " +b);
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;

        swapNumbers(a,b);
    }
}
