package Arrays.Section_AN.arrays.LogicBuilding;

public class Methods {

    public static int add(int a, int b)
    {
            return a+b;
    }
    public static int sub(int a, int b)
    {
        return a-b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        int a=10;
        int b=5;

        System.out.println("Addition of two Numbes :- "+add(a,b));
        System.out.println("Substraction of two Numbes :- "+sub(a,b));
        System.out.println("Multipl of two Numbes :- "+mul(a,b));


    }

}
