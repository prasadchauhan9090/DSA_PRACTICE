public class CountOfDigit {

    public static void main(String[] args) {


        int num=4343434;
        System.out.println("Enter number is: "+ num);



        int even_count=0;
        int odd_count=0;

        int total_sum=0;

        int sum_of_even=0;
        int sum_of_odd=0;

        while(num>0) {

            int rem = num % 10;

            total_sum=total_sum+rem;

            if (rem % 2 == 0) {
                even_count = even_count + 1;
                sum_of_even = sum_of_even + rem;
            } else {
                odd_count = odd_count + 1;
                sum_of_odd = sum_of_odd + rem;
            }

            num = num / 10;
        }



        System.out.println("EVEN COUNT"+even_count);
        System.out.println("ODD COUNT"+odd_count);


        System.out.println("SUM OF EVEN COUNT from: "+ num +sum_of_even);
        System.out.println("SUM OF ODD COUNT from: "+ num +sum_of_odd);


        System.out.println("TOTAL SUM OF EVEN COUNT from: " +num +"=="+ total_sum);

    }
}
