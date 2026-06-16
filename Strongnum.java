import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int i;
         int sum=0;
         int k;
            
            while(temp>0)
            {
          int fact=1;
               k=temp%10;
               for(i=1;i<=k;i++)
               {
               fact=fact*i;
               }
            
            sum=sum+fact;
            temp=temp/10;
            }  
        
        if(sum==n)
        {
            System.out.print("Strong Number");
        }
        else
        {
            System.out.print("Not Strong number");
        }
    }
}