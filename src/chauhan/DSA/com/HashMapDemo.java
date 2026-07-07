package chauhan.DSA.com;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String args[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = {2,3,4,3,2,1,25,6,3,4,7,2,5};

        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];

            if(map.containsKey(num))
            {
                int prev=map.get(num);
                map.put(num, prev+1);
            }
            else{

                map.put(num,1);
            }
        }
        for(int mapp:map.keySet())
        {
            System.out.println(mapp+"-->"+map.get(mapp));

        }



    }
}
