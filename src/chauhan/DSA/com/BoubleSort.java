package chauhan.DSA.com;

public class BoubleSort {

    public static void main(String args[])
    {

        int a[]={9,8,7,6,5,99,3,2,1,4};

       int n=a.length;
       int temp=0;

       for(int i=0;i<n-1;i++)
       {
           boolean swap=false;
           for(int j=0;j<n-i-1;j++)
           {
               if(a[j]>a[j+1]) {
                   temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
                   swap = true;
               }
           }
           if(!swap)
           {
               break;
           }
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(a[i]+" ");
       }

        }

    }
