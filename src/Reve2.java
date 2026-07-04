public class Reve2 {

    public static void main(String args[]) {


        int num=12345678;

        StringBuilder db= new StringBuilder();

        db.append(num);

        String rev22 = db.reverse().toString();
        System.out.println("STRING BUILDER: "+rev22);


        StringBuffer sb = new StringBuffer();

         sb.append(num);


         String rev=sb.reverse().toString();
         System.out.println("RESVERSE OF THE STRING IS: "+rev);




    }
}
