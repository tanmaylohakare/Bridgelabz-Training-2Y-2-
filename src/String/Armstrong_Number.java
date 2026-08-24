package String;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int n=sc.nextInt();
        System.out.println(Is_Armstrong(n));
    }
    public static boolean Is_Armstrong(int n)
    {
        int orignal=n;
        int d=countNumber(n);
        int sum=0;
        while(n>0)
        {
         int rem=n%10;
         sum= (int) (sum+Math.pow(rem,d));
         n=n/10;
        }

        if(sum==orignal)
        {
            return true;
        }
        else {
            return false;
        }

    }
    public static int countNumber(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
}
