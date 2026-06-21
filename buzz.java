import java.io.*;
import java.util.Scanner;
class buzz{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%7==0)||(n%10==7))
        {
            System.out.print("Buzz number");

        }
        else{
            System.out.print("Not Buzz number");
        }
        
    }
}