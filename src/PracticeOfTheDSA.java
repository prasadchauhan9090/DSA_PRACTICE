public class PracticeOfTheDSA {


    public static void main(String args[])
    {

        String st="KPRASADCHAUHAN";

        String original_string=st;


        String rev="";

        for(int i=st.length()-1;i>=0;i--)
        {
            rev=rev+st.charAt(i);

        }

        if(original_string.equals(rev))

        {
            System.out.println("Palindrome "+rev);
        }
        else {
            System.out.println("Not Palindrome "+rev);
        }




    }
}
