package String;

public class LeetCode_13 {
        public static int romanToInt(String s) {
            int result=0;
            for(int i=0;i<s.length();i++)
            {
                int current=getValue(s.charAt(i));

                if(i+1<s.length() && current<getValue(s.charAt(i+1)))
                {
                    result=result-current;
                }
                else{
                    result=result+current;
                }
            }
            return result;
        }
        public static int getValue(char ch)
        {
            if(ch=='I')
            {
                return 1;
            } if(ch=='V')
        {
            return 5;
        } if(ch=='X')
        {
            return 10;
        } if(ch=='L')
        {
            return 50;
        } if(ch=='C')
        {
            return 100;
        } if(ch=='D')
        {
            return 500;
        } if(ch=='M')
        {
            return 1000;
        }

            return 0;
        }


    public static void main(String[] args) {
         String str="LVIII";
        System.out.println(str.length());

        System.out.println(romanToInt(str));

    }
}
