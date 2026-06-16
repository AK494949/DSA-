import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int temp=n;
        int k;
        while(temp>9)
        {
            int sum=0;
            while(temp>0)
            {
               k=temp%10;
               k=k*k;
              sum=sum+k;
              temp=temp/10;
            }
            temp=sum;
        }
        if(temp==1)
        {
            System.out.print("Happy Number");
        }
        else
        {
            System.out.print("Not Happy number");
        }
    }
}