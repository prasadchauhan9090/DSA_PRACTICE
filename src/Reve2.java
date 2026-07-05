public class Reve2 {

    public static void main(String args[]) {



        int num=984;
        int sum=0;
        int rem=0;


        while(num>0)
        {
            rem=num%10;
            num=num/10;
            sum=sum+rem;
        }
        System.out.println(sum);


    }
}
