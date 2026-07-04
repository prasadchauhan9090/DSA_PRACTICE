public class PalindromeNumber {


    public static void main(String args[])
    {

        int num= 161631;
        int rev=0;

        int original_num=num;

        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==original_num)
        {
            System.out.print(original_num+" is a palindrome number");
        }
        else
        {
            System.out.print(original_num+" is not a palindrome number");
        }


    }
}
