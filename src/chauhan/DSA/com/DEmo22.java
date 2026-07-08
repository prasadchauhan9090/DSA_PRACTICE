package chauhan.DSA.com;

import java.util.HashMap;

public class DEmo22 {


    public static void main(String[] args) {


        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int arr[]={1,5,3,4,2,4,3,2,5,6,5,6,5,7};

        for(int i=0;i<arr.length;i++) {
            int val = arr[i];

            if (map.containsKey(val)) {
                int prev = map.get(val);
                map.put(val, prev + 1);
            } else {

                map.put(val, 1);
            }
        }
            for(int num:map.keySet())
            {
                System.out.println(num+" "+map.get(num));
            }

        }

    }
