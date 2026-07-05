package chauhan.DSA.com;

public class BoubleSort {

    public static void main(String args[])
    {
        int arr[] = {31,1,5,3,2,12,21,32,45,15,263,333,17};
        int temp;
        int n=arr.length-1;

        for(int i=0;i<arr.length;i++) {
            System.out.print( arr[i] + "  ");
        }

        for(int i=0;i<n;i++) {
            for(int j=0 ;j<arr.length-i-1;j++) {

                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("========================");

        for(int i=0;i<n-1;i++) {
            System.out.print(arr[i] + "  ");
        }


        }

    }
