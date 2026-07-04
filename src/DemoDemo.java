public class DemoDemo {

    public static void main(String args[])
    {

        String s="hello";
        int result=0;
        int temp=0;

        try {
            for (int i = 0; i < s.length() ; i++) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);

                int c=a;
                int d=b;

                int f= Math.abs(c-d);



                result=result+f;

                System.out.println(f);
            }
        }
        catch (Exception e) {
            System.out.println("StringIndexOutOfBoundsException");
    }

        System.out.println("result is: "+result);

    }
}
