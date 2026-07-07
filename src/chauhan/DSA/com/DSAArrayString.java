package chauhan.DSA.com;

import java.util.HashMap;

public class DSAArrayString {


    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap<>();

        String arr[] = {"Hello", "bolo" , "Hello", "tata"};

        for(int i=0;i<arr.length;i++)
        {
            String key=arr[i];

            if(map.containsKey(key))
            {
                int  curVal=map.get(key) ;
                map.put(key, curVal+1);
            }
            else{

                map.put(key,1);
            }
        }
        for(String key:map.keySet())
        {
            System.out.println(key+"--->"+map.get(key));

        }


    }
}
