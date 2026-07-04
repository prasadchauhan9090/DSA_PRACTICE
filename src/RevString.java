public class RevString {

    public static void main(String[] args) {

        String str ="AMAMA";

        String original_str=str;

        System.out.println("original_str: "+original_str);

        String rev="";

        for(int i=str.length()-1;i>=0;i--){

            rev=rev+str.charAt(i);
        }

        System.out.println("rev: "+rev);
        if(original_str.equals(rev)){

            System.out.println("Palindrome  "+rev);
        }
        else{
            System.out.println("Not Palindrome "+rev);
        }



    }
}
