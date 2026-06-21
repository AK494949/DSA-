import java.io.*;
public class secmax {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int max=a[0];
        int secmax=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                secmax=max;
                max=a[i];

            }
            else if(a[i]>secmax && a[i]!=max)
                {
                    secmax=a[i];

                } 
        }
        System.out.print(secmax);
    }
    
}
