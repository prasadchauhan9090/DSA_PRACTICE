import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();  //1234

        int rev=0;

        try {
            while (number != 0) {
                rev = rev * 10 + number % 10;
                number = number / 10;
            }
        } catch (Exception e) {
            {

                System.out.println(e);
            }
        }
        System.out.println("Revers' of the given number is: "+rev);

    }
}
